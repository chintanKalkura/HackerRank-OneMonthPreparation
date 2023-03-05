package org.practice.hackerrank.monthpreparation.week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {

    @Test
    public void should_returnTimeIn24HFormat() {
        String input = "07:05:45PM";

        TimeConversion timeConversion = new TimeConversion();
        String actual = timeConversion.convert(input);

        assertEquals("19:05:45",actual);
    }

}