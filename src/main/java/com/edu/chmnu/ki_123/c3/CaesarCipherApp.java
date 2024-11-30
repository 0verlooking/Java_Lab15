package com.edu.chmnu.ki_123.c3;

import java.util.Scanner;

public class CaesarCipherApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the shift value (integer): ");
            int shift = scanner.nextInt();
            scanner.nextLine(); // очищення буфера

            CaesarCipherCore cipher = new CaesarCipherCore(shift);

            System.out.print("Enter text to encrypt: ");
            String originalText = scanner.nextLine();

            String encryptedText = cipher.encrypt(originalText);
            System.out.println("Encrypted text: " + encryptedText);

            String decryptedText = cipher.decrypt(encryptedText);
            System.out.println("Decrypted text: " + decryptedText);
        }
    }
}
