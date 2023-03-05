package org.practice.hackerrank.monthpreparation.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagSequenceTest {

    @Test
    public void should_returnTheZigZagSequenceOfGivenInput() {

        int[] a = new int[]{3,2,1,5,4,6,7};

        ZigZagSequence zigZagSequence = new ZigZagSequence();

        int[] result = zigZagSequence.findZigZagSequence(a,a.length);

        assertArrayEquals(new int[]{1,2,3,7,6,5,4}, result);
    }
}