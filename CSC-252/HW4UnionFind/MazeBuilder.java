/**
 * @see  MyDisjSets.java
 * @author  FVCproductions
 * @version  1.0
 * @since  March 9, 2015
 * MazeBuilder.java
 * - builds maze based on height and width arguments entered by user
 * - creates text file with name based on argument enetered by user that contains said maze
 */

/**
 * @import random class to generate random maze structures
 * @import io class for file input/ouput
 */
import java.util.Random;
import java.io.*;

public class MazeBuilder 
{
    
    private static final int NUM_CASES = 4;
    private static final int NUM_ARGS = 3;

    /**
     * prints maze out to text file
     * assigns arguments to local variables
     * @param  args              
     * @throws FileNotFoundException
     * @exception FileNotFoundException [if file not found, exception thrown]
     */
    public static void main(String[] args) throws FileNotFoundException 
    {
        
        errorCheck(args);
        
        final int mazeHeight = Integer.parseInt(args[0]);
        final int mazeWidth = Integer.parseInt(args[1]);
        final String fileName = args[2];
        
        DisjointSets sets = new MyDisjSets(mazeHeight * mazeWidth);
        boolean[] mazeRoofs = new boolean[mazeHeight * mazeWidth];
        boolean[] mazeWalls = new boolean[mazeHeight * mazeWidth];
        mazeWalls[0] = true;
        
        while (sets.numSets() > 1) 
        {
            buildMaze(sets, mazeHeight, mazeWidth, mazeRoofs, mazeWalls);
        }
        
        try 
        {
            PrintStream output = new PrintStream(new File(fileName));
            printMaze(output, mazeHeight, mazeWidth, mazeRoofs, mazeWalls);
            output.close();
        } 
        
        catch (IOException ioe) 
        {
            System.err.println("Error with file.");
            System.exit(1);
        }
    }

    /**
     * computes and builds a maze based on specifications given by a user
     * makes random object
     * choose random cell
     * 4 index array representing possible options for 2nd cell draw
     * add all possible cases to array
     * union both draws set
     * delete walls/roofs accordingly
     * @param sets must be a valid object of type DisjointSets
     * @param mazeHeight must be int greater than 0
     * @param mazeWidth must be int greater than 0
     * @param mazeRoofs must be valid boolean object type
     * @param mazeWalls must be valid boolean object type
     */
    public static void buildMaze(DisjointSets sets, int mazeHeight, int mazeWidth, boolean[] mazeRoofs, boolean[] mazeWalls) 
    {
        
        final Random r = new Random();
        final int draw = r.nextInt(mazeHeight * mazeWidth);
        final int drawSet = sets.find(draw);
        int[] options = new int[NUM_CASES];
        int optionCount = 0;
        
        if (hasTopCase(draw, mazeWidth)) 
        {
            final int top = draw - mazeWidth;
            if (sets.find(top) != drawSet) 
            {
                options[optionCount] = top;
                optionCount++;
            }
        }
        
        if (hasBottomCase(draw, mazeWidth, mazeHeight)) 
        {
            final int bottom = draw + mazeWidth;
            if (sets.find(bottom) != drawSet) 
            {
                options[optionCount] = bottom;
                optionCount++;
            }
        }
        
        if (hasLeftCase(draw, mazeWidth)) 
        {
            final int left = draw - 1;
            if (sets.find(left) != drawSet) 
            {
                options[optionCount] = left;
                optionCount++;
            }
        }
        
        if (hasRightCase(draw, mazeWidth)) 
        {
            final int right = draw + 1;
            if (sets.find(right) != drawSet) 
            {
                options[optionCount] = right;
                optionCount++;
            }
        }
        
        if (optionCount > 0) 
        {
            final int draw2 = options[r.nextInt(optionCount)];
            sets.union(drawSet, sets.find(draw2));
            final int largerDraw = (draw > draw2) ? draw : draw2;
            if (mazeWidth == 1 || Math.abs(draw - draw2) > 1) 
            {
                mazeRoofs[largerDraw] = true;
            } 
            else 
            {
                mazeWalls[largerDraw] = true;
            }
        }
    }

    /**
     * uses computations completed by buildMaze to print maze
     * assigns needed characters
     * for loop for height of maze
     * prints width of roof to file
     * prints width of walls to file
     * prints fencepost
     * @param output must be a valid object of type PrintStream
     * @param mazeHeight must be int greater than 0, and signifies the desired height of the maze.
     * @param mazeWidth must be int greater than 0, and signifies the desired width of the maze.
     * @param mazeRoofs must be valid boolean object type
     * @param mazeWalls must be valid boolean object type
     */
    public static void printMaze(PrintStream output, int mazeHeight, int mazeWidth, boolean[] mazeRoofs, boolean[] mazeWalls) 
    {
        
        final String roof = "+-";
        final String noRoof = "+ ";
        final String wall = "| ";
        final String noWall = "  ";
        
        for (int i = 0; i < mazeHeight; i++) 
        {
            
            final int stop = i * mazeWidth + mazeWidth;
            
            for (int j = i * mazeWidth; j < stop; j++) 
            {
                if (!mazeRoofs[j]) 
                {
                    output.print(roof);
                } 
                else 
                {
                    output.print(noRoof);
                }
            }
            
            output.print("+");
            output.println();
            
            for (int j = i * mazeWidth; j < stop; j++) 
            {
                if (!mazeWalls[j]) 
                {
                    output.print(wall);
                } 
                else 
                {
                    output.print(noWall);
                }
            }
            
            if (i < mazeHeight - 1) 
            {
                output.print("|");
            }
            
            output.println();
        }
        
        for (int j = 0; j < mazeWidth; j++) 
        {
            output.print(roof);
        }
        
        output.println('+');
    }

    /**
     * METHODS BELOW ARE FOR INCREASED READIBILIY IN MAIN METHOD
     */
    
    /**
     * @param  draw 
     * @param  mazeWidth
     * @return true if there is top case, false otherwise      
     */
    private static boolean hasTopCase(int draw, int mazeWidth) 
    {
        return draw > mazeWidth;
    }

    /**
     * @param  draw      
     * @param  mazeWidth  
     * @param  mazeHeight 
     * @return true if there is bottom case, false otherwise
     */
    private static boolean hasBottomCase(int draw, int mazeWidth, int mazeHeight)
    {
        return draw < mazeHeight * mazeWidth - mazeWidth;
    }

    /**
     * @param  draw      
     * @param  mazeWidth  
     * @return true if there is left case, false otherwise
     */
    private static boolean hasLeftCase(int draw, int mazeWidth) 
    {
        return draw % mazeWidth != 0;
    }

    /**
     * @param  draw      
     * @param  mazeWidth  
     * @return true if there is right case, false otherwise
     */
    private static boolean hasRightCase(int draw, int mazeWidth) 
    {
        return (draw + 1) % mazeWidth != 0;
    }

    /**
     * determines if parameters passed by user are valid
     * @param string[] args
     */
    private static void errorCheck(String[] args) 
    {
        if (args.length != NUM_ARGS || Integer.parseInt(args[0]) <= 0 || Integer.parseInt(args[1]) <= 0) 
        {
            System.out.println("Please include three arguments, <height> <width> <filename>");
            System.out.println("where <height> and <width> are integers greater than zero");
            System.out.println("and <filename> is a valid file open for writing.");
            System.exit(1);
        }
    }

}