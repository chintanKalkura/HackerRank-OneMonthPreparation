package org.practice.hackerrank.monthpreparation.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PrimeDatesTest {

    PrimeDates primeDates;
    @BeforeEach
    void setUp() {
        primeDates = new PrimeDates();
    }

    @Test
    public void should_returnCountOfPrimeDates_forGivenInput() {
        int actual = primeDates.primeDates(LocalDate.of(2025,8,2),
                LocalDate.of(2025, 9, 4));

        assertEquals(5, actual);

        actual = primeDates.primeDates(LocalDate.of(8604,1,10),
                LocalDate.of(9999, 6, 8));

        assertEquals(182278, actual);

        actual = primeDates.primeDates(LocalDate.of(9693,3,15),
                LocalDate.of(9747, 1, 13));

        assertEquals(6887, actual);
    }
}