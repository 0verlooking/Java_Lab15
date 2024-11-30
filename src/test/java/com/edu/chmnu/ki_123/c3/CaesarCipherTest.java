package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherCoreTest {

    @Test
    void testEncryptionDecryption() {
        int shift = 3;
        CaesarCipherCore cipher = new CaesarCipherCore(shift);

        String originalText = "Hello, World!";
        String encryptedText = cipher.encrypt(originalText);
        String decryptedText = cipher.decrypt(encryptedText);

        assertNotEquals(originalText, encryptedText, "Encrypted text should differ from original text");
        assertEquals(originalText, decryptedText, "Decrypted text should match the original text");
    }

    @Test
    void testSpecialCharactersAndSpaces() {
        int shift = 5;
        CaesarCipherCore cipher = new CaesarCipherCore(shift);

        String originalText = "   !!! ??? @@@ ###";
        String encryptedText = cipher.encrypt(originalText);
        String decryptedText = cipher.decrypt(encryptedText);

        assertEquals(originalText, decryptedText, "Special characters and spaces should remain unchanged");
        assertEquals(originalText, encryptedText, "Special characters should not be affected by encryption");
    }

    @Test
    void testNegativeShift() {
        int shift = -3;
        CaesarCipherCore cipher = new CaesarCipherCore(shift);

        String originalText = "Negative Test";
        String encryptedText = cipher.encrypt(originalText);
        String decryptedText = cipher.decrypt(encryptedText);

        assertEquals(originalText, decryptedText, "Decrypted text should match the original text with negative shift");
    }

    @Test
    void testLargeShift() {
        int shift = 29;
        CaesarCipherCore cipher = new CaesarCipherCore(shift);

        String originalText = "Large Shift Test";
        String encryptedText = cipher.encrypt(originalText);
        String decryptedText = cipher.decrypt(encryptedText);

        assertEquals(originalText, decryptedText, "Decrypted text should match the original text with large shift");
    }

    @Test
    void testEmptyString() {
        int shift = 5;
        CaesarCipherCore cipher = new CaesarCipherCore(shift);

        String originalText = "";
        String encryptedText = cipher.encrypt(originalText);
        String decryptedText = cipher.decrypt(encryptedText);

        assertEquals(originalText, encryptedText, "Encrypted empty string should match original");
        assertEquals(originalText, decryptedText, "Decrypted empty string should match original");
    }
}
