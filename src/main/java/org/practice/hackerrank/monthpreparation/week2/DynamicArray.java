package org.practice.hackerrank.monthpreparation.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DynamicArray {

    public List<Integer> dynamicArray(int n, List<List<Integer>> queries) throws DynamicArrayException {
        // Write your code here
        List<List<Integer>> arr = new ArrayList<>(n);

        IntStream.range(0, n).forEach(i->arr.add(i, new ArrayList<>()));

        int lastAnswer = 0;

        List<Integer> answers = new ArrayList<>();

        for(List<Integer> query : queries) {

            int index = ((query.get(1) ^ lastAnswer) % n);
            List<Integer> subArr = arr.get(index);

            try {
                switch (query.get(0)) {
                    case 1 -> subArr.add(query.get(2));
                    case 2 -> {
                        lastAnswer = subArr.get(query.get(2) % subArr.size());
                        answers.add(lastAnswer);
                    }
                    default -> {
                    }
                }
            }
            catch(Exception ex) {
                throw new DynamicArrayException(ex);
            }
        }
        return answers;

    }
}
