package org.practice.hackerrank.monthpreparation.week2;

import java.util.HashMap;
import java.util.List;

public class SalesByMatch {
    public int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();

        ar.forEach(e->{
            map.put(e, map.getOrDefault(e, 0) + 1);
        });

        int pairs = 0;

        for(int key : map.keySet()) {
            pairs += map.get(key)/2;
        }

        return pairs;

    }
}
