/**
 * FVCproductions
 * CSC 395
 * April 28, 2016
 * Java Program
 * Caesar Cipher - Encryption & Decryption
 */

import java.io.*;
import java.util.*;
import java.lang.*;
import javax.print.attribute.standard.*;

public class Part_1 {

    public static String encrypt(String message, int shift) {
        String encrypted = "";
        char[] toEncrypt = message.toCharArray();
        for (char aMsg : toEncrypt) {
            if (Character.isLetter(aMsg)) {
                char c = (char) ((int) aMsg + shift);
                if (c > 'z') {
                    encrypted += (char) ((int) aMsg + (shift - 26));
                } else {
                    encrypted += (char) ((int) aMsg + shift);
                }
            } else {
                encrypted += aMsg;
            }
        }
        return encrypted;
    }

    public static String decrypt(String encryptedMessage, int shift) {
        String plainTxt = "";
        char[] toDecrypt = encryptedMessage.toCharArray();
        for (char anEncryptedMsg : toDecrypt) {
            if (Character.isLetter(anEncryptedMsg)) {
                char c = (char) ((int) anEncryptedMsg - shift);
                if (c < 'a') {
                    plainTxt += (char) ((int) anEncryptedMsg - (shift - 26));
                } else {
                    plainTxt += (char) ((int) anEncryptedMsg - shift);
                }
            } else {
                plainTxt += anEncryptedMsg;
            }
        }
        return plainTxt;
    }

    public static void main(String[] args) {
        System.out.println("~~~ CAESAR CIPHER ~~~\n");
        System.out.println("This program allows you to encrypt and decrypt plain text messages using the Caesar cipher.");
        System.out.println("\nCopyright FVCproductions 2016.\n");
        Scanner read = new Scanner(System.in);
        // asking user for plain text message
        System.out.print("Please enter the plain text message you wish to encrypt: ");
        String message = read.nextLine();
        // asking user for shift value
        System.out.print("\nPlease enter the shift value for the encryption process: ");
        int givenShift = read.nextInt();
        String encryptedMessage = encrypt(message, givenShift);
        String decryptedMessage = decrypt(encryptedMessage, givenShift);
        // printing out encrypted message with given shift parameter
        System.out.println("\nEncrypted Message: " + encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }
}

/** SAMPLE OUTPUT

~~~ CAESAR CIPHER ~~~

This program allows you to encrypt and decrypt plain text messages using the Caesar cipher.

Copyright FVCproductions 2016.

Please enter the plain text message you wish to encrypt: abcdefghijklmnopqrstuvwxyz

Please enter the shift value for the encryption process: 18

Encrypted Message: stuvwxyzabcdefghijklmnopqr
Decrypted Message: abcdefghijklmnopqrstuvwxyz

**/