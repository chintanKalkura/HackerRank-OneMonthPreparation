package org.practice.hackerrank.monthpreparation.week1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlippingBitsTest {

    @Test
    public void should_return32BitUnsignedInteger_byFlippingBitsOfGivenUnsigned32BitInteger() {
        FlippingBits flippingBits = new FlippingBits();

        long[] input = new long[]{2147483647, 1, 0};
        List<Long> expected = new ArrayList<>(Arrays.asList(2147483648l, 4294967294l, 4294967295l)) ;
        List<Long> actual = new ArrayList<>();

        Arrays.stream(input).forEach(e->{
            actual.add(flippingBits.flippingBits(e));
        });

        assertEquals(actual,expected);

    }
}