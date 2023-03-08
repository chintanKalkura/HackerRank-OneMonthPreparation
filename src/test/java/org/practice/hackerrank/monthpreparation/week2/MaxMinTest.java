package org.practice.hackerrank.monthpreparation.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.practice.hackerrank.monthpreparation.TestBase;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MaxMinTest {

    MaxMin maxMin;
    @BeforeEach
    void setUp() {
        maxMin = new MaxMin();
    }

    @Test
    public void should_returnMinimumFrequencyForGivenInput() {
        int actual = maxMin.maxMin(2, Arrays.asList(1,4,7,2));
        assertEquals(1,actual);
    }

    @Test
    public void should_throwException_whenInputsAreOutOfBounds() {

        assertThrows(UnsupportedOperationException.class, ()-> maxMin.maxMin(0,Arrays.asList(1,2)));

        assertThrows(UnsupportedOperationException.class, ()-> maxMin.maxMin(2, Arrays.asList(1)));

    }
}