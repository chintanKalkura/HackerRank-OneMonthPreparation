package org.practice.hackerrank.monthpreparation.week3;

public class SherlockAndValidString {

    public String isValid(String s) {
        // Write your code here
        int[] frequencies = new int[26];

        for(int i=0; i<s.length(); i++) {
            frequencies[s.charAt(i)-'a']++;
        }

        boolean exceptionUsed = false;
        int freq = 0;

        for(int i=0; i<frequencies.length; i++) {
            if(frequencies[i] == 0)
                continue;

            if(freq == 0) // the letter doesn't exist in the given string.
                freq = frequencies[i];

            if(freq == frequencies[i])
                continue;
            else {
                if(exceptionUsed) //one character already removed to get valid string.
                    return "NO";
                if(frequencies[i] == 1 || freq == frequencies[i]-1) //one character can be removed to get valid string.
                    exceptionUsed = true;
                else
                    return "NO";
            }
        }

        return "YES";
    }
}
