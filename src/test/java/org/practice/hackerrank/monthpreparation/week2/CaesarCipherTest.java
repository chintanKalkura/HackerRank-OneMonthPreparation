package org.practice.hackerrank.monthpreparation.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {
    CaesarCipher caesarCipher;
    @BeforeEach
    void setUp() {
        caesarCipher = new CaesarCipher();
    }

    @Test
    public void should_returnEncryptedStringForGivenInput() {
        String result = caesarCipher.caesarCipher("middle-Outz", 2);
        assertEquals("okffng-Qwvb", result);
    }

    @Test
    public void should_returnEncryptedString_whenKIsMoreThan26() {
        String result = caesarCipher.caesarCipher("middle-Outz", 28);
        assertEquals("okffng-Qwvb", result);
    }

    @Test
    public void should_returnEncryptedString_whenInputStringHasOnlySpecialCharacters() {
        String result = caesarCipher.caesarCipher("()*&^$_-:", 8);
        assertEquals("()*&^$_-:", result);
    }

    @Test
    public void should_returnEncryptedString_whenKIsLarge() {
        String result = caesarCipher.caesarCipher("middle-Outz", (26*10000)+2);
        assertEquals("okffng-Qwvb", result);
    }

}