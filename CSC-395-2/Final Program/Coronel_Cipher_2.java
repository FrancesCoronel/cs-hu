/**
 * FVCproductions
 * CSC 395
 * April 28, 2016
 * Java Program
 * Affine Cipher - Encryption & Decryption
 */

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

public class Part_2 {

	public static String encrypt(String input, int firstKey, int secondKey) {
		StringBuilder builder = new StringBuilder();
		for (int in = 0; in < input.length(); in++) {
			char character = input.charAt(in);
			if (Character.isLetter(character)) {
				character = (char) ((firstKey * (character - 'a') + secondKey) % 26 + 'a');
			}
			builder.append(character);
		}
		return builder.toString();
	}

	public static String decrypt(String input, int firstKey, int secondKey) {
		StringBuilder builder = new StringBuilder();
		// compute firstKey^-1 aka "modular inverse"
		BigInteger inverse = BigInteger.valueOf(firstKey).modInverse(BigInteger.valueOf(26));
		// perform actual decryption
		for (int in = 0; in < input.length(); in++) {
			char character = input.charAt(in);
			if (Character.isLetter(character)) {
				int decoded = inverse.intValue() * (character - 'a' - secondKey + 26);
				character = (char) (decoded % 26 + 'a');
			}
			builder.append(character);
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		System.out.println("~~~ AFFINE CIPHER ~~~\n");
		System.out.println("This program allows you to encrypt and decrypt plain text messages using the Affine cipher. Make sure your key values are prime to each other.");
		System.out.println("\nCopyright FVCproductions 2016.\n");
		Scanner read = new Scanner(System.in);
		// asking user for plain text message
		System.out.print("Please enter the message you wish to encrypt: ");
		String message = read.nextLine();
		// asking user for first key value
		System.out.print("\nPlease enter the value of the first key: ");
		int firstKey = read.nextInt();
		// asking user for second key value
		System.out.print("\nPlease enter the value of the second key: ");
		int secondKey = read.nextInt();
		String encryptedMessage = encrypt(message, firstKey, secondKey);
		String decryptedMessage = decrypt(encryptedMessage, firstKey, secondKey);
		// printing out encrypted message with given shift parameter
		System.out.println("\nEncrypted Message: " + encryptedMessage);
		System.out.println("Decrypted Message: " + decryptedMessage);
	}
}

/** SAMPLE OUTPUT

~~~ AFFINE CIPHER ~~~

This program allows you to encrypt and decrypt plain text messages using the Affine cipher. Make sure your key values are prime to each other.

Copyright FVCproductions 2016.

Please enter the message you wish to encrypt: abcdefghijklmnopqrstuvwxyz

Please enter the value of the first key: 5

Please enter the value of the second key: 19

Encrypted Message: tydinsxchmrwbglqvafkpuzejo
Decrypted Message: abcdefghijklmnopqrstuvwxyz

**/