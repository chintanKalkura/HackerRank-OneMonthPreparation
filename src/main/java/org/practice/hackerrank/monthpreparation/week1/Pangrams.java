package org.practice.hackerrank.monthpreparation.week1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Pangrams {

    public String pangrams(String s) {
        // Write your code here

        String newString = s.replaceAll(" ", "").toLowerCase();

        boolean[] flags = new boolean[26];

        for(int i=0; i<newString.length(); i++) {
            flags[newString.charAt(i) - 97] = true;
        }

        return IntStream.range(0, flags.length)
                .mapToObj(idx -> flags[idx])
                .allMatch(b -> b) ? "pangram" : "not pangram";

    }
}
