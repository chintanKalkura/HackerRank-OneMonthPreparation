package org.practice.hackerrank.monthpreparation.week2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GridChallengeTest {

    @Test
    public void should_returnYes_forGivenInput() {
        GridChallenge gridChallenge = new GridChallenge();

        assertEquals("YES",gridChallenge.gridChallenge(new ArrayList<>(Arrays.asList("abc",
                "adf","afy","xyz"))));
    }

    @Test
    public void should_returnNo_forGivenInput() {
        GridChallenge gridChallenge = new GridChallenge();

        assertEquals("NO",gridChallenge.gridChallenge(new ArrayList<>(Arrays.asList("mpxz",
                "wlmf","abcd"))));
    }

}