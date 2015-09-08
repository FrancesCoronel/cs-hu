//fvcproductions
//intro to primitive types in java

public class PrimitiveTypes {

   public static void main (String[] args) {
   
      String name = "FVCproductions", classification = "Freshman", major = "Computer Science";
      
      // defined variables so time to print 
      
      System.out.println("Name: " + name);
      System.out.println("Classification: " + classification);
      System.out.println("Major: " + major);
      
      System.out.print("\n");
      
      // hard coded print lines now
      
      System.out.println("Name: " + name);
      System.out.println("Address: 6669 Getta Lane");
      System.out.println("Phone: (757) 342 - 7893");
      System.out.println("College Major: " + major);
      
      System.out.print("\n");
      
      // define variables for rectangle and printing out rectangle variables
      
      int length, width, rectangle_area;
      
      length = 10;
      width = 8;
      
      rectangle_area = length * width;
      
      System.out.println("The rectangle width is " + width + " and the length is: " + length + ".");
      System.out.println("The rectangle area is " + rectangle_area);
      
      System.out.print("\n");
      
      // define variables for small cost program and printing variables
      
      double total, cost, rate, tax;
      
      cost = 100.00;
      rate = 00.05;
      tax = cost * rate;
      total = cost + tax;
      
      System.out.println("Cost: " + cost);
      System.out.println("Rate: " + rate);
      System.out.println("Tax: " + tax);
      System.out.println("Total: " + total);
      
      System.out.print("\n");
      
      // defined variables for dividend and basic math rules now
      
      int dividend, divisor, quotient, remainder;
      
      dividend = 13;
      divisor = 5;
      
      quotient = dividend / divisor;
      remainder = dividend % divisor;
      
      System.out.println("Dividend: " + dividend);
      System.out.println("Divisor: " + divisor);
      System.out.println("Quotient: " + quotient);
      System.out.println("Remainder: " + remainder);
      
      System.out.print("\n");
      
      // defining primitive types and printing ranges
      
      byte byteLow = -128, byteHigh = 127;
      short shortLow = -32768, shortHigh = 32767; 
      int intLow = -2147483648, intHigh = 2147483647;
      long longLow = -9223372036854775808L, longHigh = 9223372036854775807L ;
      float floatLow = -3.48E-38F , floatHigh = 3.48E37F;
      double doubleLow = -1.7E-308, doubleHigh = 1.7E308; 
      
      System.out.println("byte Range is from " + byteLow + " to " + byteHigh);
      System.out.println("short Range is from " + shortLow + " to " + shortHigh);
      System.out.println("int Range is from " + intLow + " to " + intHigh);
      System.out.println("long Range is from " + longLow + " to " + longHigh);
      System.out.println("float Range is from " + floatLow + " to " + floatHigh);
      System.out.println("double Range is from " + doubleLow + " to " + doubleHigh);
   
   }
}