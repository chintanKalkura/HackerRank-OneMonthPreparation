package org.practice.hackerrank.monthpreparation.week1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubArrayDivisionTest {

    @Test
    public void should_returnNumberOfCombinations_forGivenInput() {
        List<Integer> s = new ArrayList<>(Arrays.asList(2,2,1,3,2));
        int d = 4;
        int m = 2;

        SubArrayDivision subArrayDivision = new SubArrayDivision();

        int actual = subArrayDivision.birthday(s, d, m);

        assertEquals(2, actual);

    }

}