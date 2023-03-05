package org.practice.hackerrank.monthpreparation.week1;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@AllArgsConstructor
public class PlusMinus {
    ;

    public List<Double> execute(List<Integer> arr) {
        // Write your code here
        AtomicInteger plusCount = new AtomicInteger(0);
        AtomicInteger minusCount = new AtomicInteger(0);
        AtomicInteger zeroCount = new AtomicInteger(0);

        arr.parallelStream().forEach(e->{
            if(e==0)
                zeroCount.getAndIncrement();
            else if(e<0)
                minusCount.getAndIncrement();
            else
                plusCount.getAndIncrement();
        });

        int n = arr.size();
        List<Double> res = new ArrayList<>();
        res.add((double)plusCount.get()/n);
        res.add((double)minusCount.get()/n);
        res.add((double)zeroCount.get()/n);

        System.out.printf("%.6f%n", res.get(0));
        System.out.printf("%.6f%n", res.get(1));
        System.out.printf("%.6f%n", res.get(2));

        return res;

    }
}
