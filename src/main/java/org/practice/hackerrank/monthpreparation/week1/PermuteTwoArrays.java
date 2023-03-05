package org.practice.hackerrank.monthpreparation.week1;

import java.util.Collections;
import java.util.List;

public class PermuteTwoArrays {
    public String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        Collections.sort(A);

        return twoArraysRecursive(k,A,B,0);

    }

    private String twoArraysRecursive(int k, List<Integer> A, List<Integer> B, int i) {

        if(B.size() == 0)
            return "YES";

        int pair = findSuitablePairsInA(k, B.get(i), A);

        if(pair == -1)
            return "NO";

        int a = pair;
        int b = B.get(i);

        A.remove(Integer.valueOf(a));
        B.remove(Integer.valueOf(b));

        return twoArraysRecursive(k, A, B, i);
    }

    private int findSuitablePairsInA(int k, int b, List<Integer> A) {
        for(int a : A) {
            if(a+b >= k)
                return a;
        }
        return -1;
    }
}
