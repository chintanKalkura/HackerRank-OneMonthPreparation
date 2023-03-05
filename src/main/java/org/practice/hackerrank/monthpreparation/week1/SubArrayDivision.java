package org.practice.hackerrank.monthpreparation.week1;

import java.util.List;

public class SubArrayDivision {
    public int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int ways = 0;

        for(int i=0;i<=s.size()-m; i++) {
            int sum = 0;

            for(int j=i; j<i+m; j++) {
                sum += s.get(j);
                if(sum > d)
                    break;
            }
            if(sum == d)
                ways++;
        }

        return ways;
    }
}
