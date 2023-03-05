package org.practice.hackerrank.monthpreparation.week1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermuteTwoArraysTest {

    @Test
    public void should_checkIfTwoArraysCanBePermutedToHoldTheGivenRelation_andReturnYesOrNo() {
        List<Integer> A = new ArrayList<>(Arrays.asList(2,1,3));
        List<Integer> B = new ArrayList<>(Arrays.asList(7,8,9));
        int k = 10;

        PermuteTwoArrays permuteTwoArrays = new PermuteTwoArrays();

        String actual = permuteTwoArrays.twoArrays(k, A, B);

        assertEquals("YES", actual);

    }

}