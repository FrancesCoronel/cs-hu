/**
 * FVCproductions
 * CSC 510
 * Permutations
 * Discrete Mathematics
 * Rosen
 */

import java.util.*;

public class Permutations {

  static int a[] = new int[100];
  static int n;

  public static void nextPermutation(int a[]) {
    int j, k, r, s;
    int temp = 0;
    j = n - 1;
    while (a[j] > a[j + 1])
      j = j - 1;
    k = n;
    while (a[j] > a[k])
      k = k - 1;
    temp = a[j];
    a[j] = a[k];
    a[k] = temp;
    r = n;
    s = j + 1;
    while (r > s) {
      temp = a[r];
      a[r] = a[s];
      a[s] = temp;
      r = r - 1;
      s = s + 1;
    }
  }

  public static int factorial(int n) {
    if (n == 0 | n == 1) return 1;
    else return n * factorial(n - 1);
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter n: ");
    n = keyboard.nextInt();
    for (int i = 1; i <= n; i++)
      a[i] = i;
    int numPermutations = factorial(n);
    for (int i = 1; i <= numPermutations; i++) {
      for (int j = 1; j <= n; j++)
        System.out.print(a[j] + " ");
      System.out.println();
      nextPermutation(a);
    }
  }

};