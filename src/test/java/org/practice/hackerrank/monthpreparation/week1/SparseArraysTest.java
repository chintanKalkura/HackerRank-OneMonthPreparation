package org.practice.hackerrank.monthpreparation.week1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SparseArraysTest {

    @Test
    void should_returnNumberOfMatchesForQueriesInInputStrings() {

        SparseArrays sparseArrays = new SparseArrays();

        List<String> strings = Arrays.asList("abcde","sdaklfj","asdjf","na","basdn","sdaklfj","asdjf",
                "na","asdjf","na","basdn","sdaklfj","asdjf");
        List<String> queries = Arrays.asList("abcde","sdaklfj","asdjf","na","basdn");

        List<Integer> actual = sparseArrays.matchingStrings(strings,queries);

        assertEquals(new ArrayList<>(Arrays.asList(1,3,4,3,2)),actual);
    }
}