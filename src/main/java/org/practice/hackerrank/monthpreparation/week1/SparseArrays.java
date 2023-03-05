package org.practice.hackerrank.monthpreparation.week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class SparseArrays {
    public List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();

        strings.stream().forEach(str->{
            if(map.containsKey(str))
                map.put(str,map.get(str)+1);
            else
                map.put(str, 1);
        });

        List<Integer> result = new ArrayList<>(queries.size());

        for(String query : queries) {
            result.add(map.getOrDefault(query, 0));
        }

        return result;
    }
}
