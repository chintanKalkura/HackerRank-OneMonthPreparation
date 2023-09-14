package org.practice.hackerrank.monthpreparation.week3;

import java.util.List;

public class NewYearChaos {

    public void minimumBribes(List<Integer> q) {
        // Write your code here
        int bribes = 0;
        for(int i=0; i<q.size(); i++) {
            if(q.get(i) > i+1+2) {
                System.out.println("Too chaotic");
                return;
            }
            for(int j=q.get(i)-2; j<i ; j++) {
                if(j>=0 && q.get(j) > q.get(i))
                    bribes++;
            }
        }

        System.out.println(bribes);
    }
}
