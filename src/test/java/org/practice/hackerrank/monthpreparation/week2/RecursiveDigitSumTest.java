package org.practice.hackerrank.monthpreparation.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveDigitSumTest {

    RecursiveDigitSum recursiveDigitSum;
    @BeforeEach
    void setUp() {
        recursiveDigitSum = new RecursiveDigitSum();
    }

    @Test
    void should_returnSuperDigitOfGivenInput() {
        assertEquals(8, recursiveDigitSum.superDigit("9875", 4));
    }

    @Test
    void should_returnSuperDigitForLargeInput() {
        int result1 = recursiveDigitSum.superDigit("67543210225972398793209237871298129", 9998);
        int result2 = recursiveDigitSum.superDigit("67543210225972398793209237871298129", 9998);
        assertEquals(result2, result1);
    }
}