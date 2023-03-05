package org.practice.hackerrank.monthpreparation.week1;

import java.util.HashSet;
import java.util.List;

public class LonelyInteger {

    public int lonelyinteger(List<Integer> a) {
        // Write your code here
        HashSet<Integer> set = new HashSet<>();

        a.forEach(e->{
            if(set.contains(e))
                set.remove(e);
            else
                set.add(e);
        });

        return set.iterator().next();

    }
}
