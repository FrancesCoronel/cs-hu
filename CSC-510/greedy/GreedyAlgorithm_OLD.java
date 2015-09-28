/**
 * Greedy Algorithm
 * FVCproductions
 * 09.08.2015
 */

import java.util.*;

class GreedyAlgorithm {
	public static void change(int money) {
		System.out.print("Change is ");
		while (money > 0) {
			if (money >= 25) {
				System.out.print((int)Math.floor(money / 25) + " Quarters ");
				money -= Math.floor(money / 25) * 25;
			} else if (money >= 10) {
				System.out.print((int)Math.floor(money / 10) + " Dimes ");
				money -= Math.floor(money / 10) * 10;
			} else if (money >= 5) {
				System.out.print((int)Math.floor(money / 5) + " Nickels ");
				money -= Math.floor(money / 5) * 5;
			} else if (money >= 1) {
				System.out.print((int)Math.round(money / 1) + " Pennies ");
				money -= Math.round(money / 1) * 1;
			}
		}
	}
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter change in cents: ");
		change(keyboard.nextInt());
	}
}