package org.practice.hackerrank.monthpreparation.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumXORTest {

    SumXOR sumXOR;
    @BeforeEach
    void setUp() {
        sumXOR = new SumXOR();
    }

    @Test
    void should_returnTheCountForGivenInput() {
        assertEquals(2, sumXOR.sumXor(5));
    }

    @Test
    void should_returnTheCountForInput() {
        assertEquals(4, sumXOR.sumXor(10));
    }
}