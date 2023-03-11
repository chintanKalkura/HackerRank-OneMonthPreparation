package org.practice.hackerrank.monthpreparation.week2;

public class RecursiveDigitSum {

    public int superDigit(String n, int k) {
        // Write your code here
        if(n.length() == 1)
            return Integer.parseInt(n);

        long superDigit = n.chars()
                .map(c->Integer.parseInt(String.valueOf((char)c)))
                .sum();

        superDigit = superDigit * k;

        return superDigit(String.valueOf(superDigit), 1);
    }
}
