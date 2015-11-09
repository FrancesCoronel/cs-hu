/**
 * FVCproductions
 * CSC 510
 * Combinations
 * Discrete Mathematics
 * Rosen
 */

import java.util.*;

public class Combinations {

  static int a[] = new int[100];
  static int n, r, i;

  public static void nextCombination(int a[]) {
    int i, j;
    i = r;
    while (a[i] == n - r + i)
      i = i - 1;
    a[i] = a[i] + 1;
    for (j = i + 1; i <= r; i++)
      a[j] = a[i] + j - i;
  }

  public static int factorial(int n) {
    if (n == 0 | n == 1) return 1;
    else return n * factorial(n - 1);
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter n: ");
    n = keyboard.nextInt();
    System.out.print("Enter r: ");
    r = keyboard.nextInt();
    for (int i = 1; i <= n; i++)
      a[i] = i;
//    int numCombinations = factorial(n) / (factorial(r) * factorial(n-r));
//    for (int i = 1; i <= numCombinations; i++) {
    while(a[i] != 1) {
      for (int j = 1; j <= r; j++)
        System.out.print(a[j] + " ");
      System.out.println();
      nextCombination(a);
    }
  }

};