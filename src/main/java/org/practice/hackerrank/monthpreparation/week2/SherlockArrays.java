package org.practice.hackerrank.monthpreparation.week2;

import java.util.List;

public class SherlockArrays {

    public String balancedSums(List<Integer> arr) {
        // Write your code here
        int leftSum = 0;
        int rightSum = arr.stream().mapToInt(Integer::intValue).sum();

        for(int i=0; i<arr.size(); i++) {
            if(i>0) {
                leftSum += arr.get(i-1);
            }

            rightSum -= arr.get(i);

            if(leftSum==rightSum)
                return "YES";
        }

        return "NO";

    }
}
