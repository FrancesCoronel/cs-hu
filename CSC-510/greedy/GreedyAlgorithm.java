/**
 * Greedy Algorithm
 * FVCproductions
 * 09.16.2015
 * CSC 510
 */

import java.util.*;

public class GreedyAlgorithm {
  
  static int c[] = { 0, 25, 10, 5, 1 };
  static int d[] = { 0, 0, 0,  0,  0 };
  final static int r = 4;

  public static void main(String[] args) {
  
    Scanner keyboard = new Scanner(System.in);
  
    System.out.print("Enter change in cents: ");
    int n = keyboard.nextInt();
  
    for (int i = 1; i <= r; i++) {
      
      d[i] = 0;
      
      while (n >= c[i]) {
        d[i] = d[i] + 1;
        n = n - c[i];
      }
    
    }
    
    System.out.print("Change is ");
    
    if (d[1] > 0) {
      System.out.print(d[1] + " Quarters ");
    }
    
    if (d[2] > 0) {
      System.out.print(d[2] + " Nickels ");
    }
    
    if (d[3] > 0) {
      System.out.print(d[3] + " Dimes ");
    }
    
    if (d[4] > 0) {
      System.out.print(d[4] + " Pennies ");
    }
  
  }
}