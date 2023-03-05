package org.practice.hackerrank.monthpreparation.week1;

import org.practice.hackerrank.monthpreparation.TestBase;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxSumTest extends TestBase {

    @Test
    public void should_returnMinAndMaxSumOfGivenList() {
        MinMaxSum minMaxSum = new MinMaxSum();

        String actual = minMaxSum.execute(Arrays.asList(1,3,5,7,9));

        assertEquals(16+" "+24,actual);
    }

}