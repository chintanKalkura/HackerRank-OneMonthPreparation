package org.practice.hackerrank.monthpreparation.week1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort {

    public List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        int[] result = new int[100];

        arr.forEach(e->result[e]++);

        return Arrays.stream(result).boxed().toList();
    }
}
