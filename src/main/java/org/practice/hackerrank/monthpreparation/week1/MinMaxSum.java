package org.practice.hackerrank.monthpreparation.week1;

import java.util.Collections;
import java.util.List;

public class MinMaxSum {

    public String execute(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);

        long minSum = 0;
        long maxSum = 0;

        for(int i=0; i<arr.size(); i++) {
            if(i==0)
                minSum += arr.get(i);
            else if(i == arr.size()-1)
                maxSum += arr.get(arr.size() - 1);
            else {
                minSum += arr.get(i);
                maxSum += arr.get(i);
            }
        }
        String res = minSum+" "+maxSum;
        System.out.print(res);
        return res;
    }
}
