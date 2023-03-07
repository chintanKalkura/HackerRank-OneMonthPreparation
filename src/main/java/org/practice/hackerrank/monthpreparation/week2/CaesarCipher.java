package org.practice.hackerrank.monthpreparation.week2;

public class CaesarCipher {
    public String caesarCipher(String s, int k) {
        // Write your code here
        while(k>26)
            k-=26;

        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            sb.append(getEncryptedChar(c,k));
        }

        return sb.toString();
    }
    public char getEncryptedChar(char c, int k) {

        if(Character.isLetter(c)) {
            int newValue = c + k;

            if(Character.isUpperCase(c)) {
                newValue = newValue > 'Z' ? 'A' - 1 + (newValue-'Z') : newValue;
            }
            else {
                newValue = newValue > 'z' ? 'a' - 1 + (newValue-'z') : newValue;
            }
            return (char) newValue;
        }
        else
            return c;
    }
}
