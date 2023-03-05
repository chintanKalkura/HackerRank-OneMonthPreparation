package org.practice.hackerrank.monthpreparation.week1;

import java.util.List;

public class DiagonalDifference {

    public int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int n = arr.size();

        int lToR = 0;
        int rToL = 0;

        for(int i=0; i<n; i++) {
            lToR += arr.get(i).get(i);
            rToL += arr.get(i).get(n-1-i);
        }

        return Math.abs(lToR - rToL);
    }
}
