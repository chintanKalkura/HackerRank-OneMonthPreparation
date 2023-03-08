package org.practice.hackerrank.monthpreparation.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GridChallenge {

    public String gridChallenge(List<String> grid) {
        // Write your code here
        List<String> sortedGrid = new ArrayList<>();

        grid.forEach(s->sortedGrid.add(Stream.of(s.split(""))
                        .sorted()
                        .collect(Collectors.joining())
            )
        );

        boolean areColumnsSorted = IntStream.range(0,sortedGrid.get(0).length())
                .allMatch(i-> IntStream.range(1,sortedGrid.size())
                        .allMatch(j-> sortedGrid.get(j - 1).charAt(i) <= sortedGrid.get(j).charAt(i)
                        ));

        return areColumnsSorted ? "YES" : "NO";
    }
}
