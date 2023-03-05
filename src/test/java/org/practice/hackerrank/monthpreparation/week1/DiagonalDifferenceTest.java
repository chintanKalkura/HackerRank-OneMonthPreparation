package org.practice.hackerrank.monthpreparation.week1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalDifferenceTest {

    @Test
    public void should_returnAbsoluteValueOfDiagonalDifference_ofASquareMatrixInTheInput() {
        DiagonalDifference diagonalDifference = new DiagonalDifference();

        List<List<Integer>> input = new ArrayList<List<Integer>>();
        input.add(Arrays.asList(1,2,3));
        input.add(Arrays.asList(4,5,6));
        input.add(Arrays.asList(9,8,9));

        assertEquals( 2, diagonalDifference.diagonalDifference(input));

    }

}