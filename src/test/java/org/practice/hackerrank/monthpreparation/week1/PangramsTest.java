package org.practice.hackerrank.monthpreparation.week1;

import org.junit.jupiter.api.Test;
import org.practice.hackerrank.monthpreparation.week1.Pangrams;

import static org.junit.jupiter.api.Assertions.*;

class PangramsTest {

    @Test
    public void should_validateWhetherGivenStringIsPangramOrNot_andReturnResult() {
        String input = "We promptly judged antique ivory buckles for the next prize";

        Pangrams pangrams = new Pangrams();

        String actual = pangrams.pangrams(input);

        assertEquals("pangram", actual);
    }
}
