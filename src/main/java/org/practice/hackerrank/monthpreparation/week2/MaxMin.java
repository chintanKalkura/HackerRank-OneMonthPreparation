package org.practice.hackerrank.monthpreparation.week2;

import java.util.Collections;
import java.util.List;

public class MaxMin {

    public int maxMin(int k, List<Integer> arr) throws UnsupportedOperationException {

        if(arr.size() < 2 || arr.size() > 100000 || k < 2 || k > arr.size())
            throw new UnsupportedOperationException("Input does not meet the constraints.");

        // Write your code here
        Collections.sort(arr);

        int minFrequency = Integer.MAX_VALUE;

        for(int i=0; i<=arr.size()-k; i++) {
            int frequency = arr.get(i+k-1) - arr.get(i);

            minFrequency = Math.min(frequency, minFrequency);
        }

        return minFrequency;
    }
}
