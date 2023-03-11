package org.practice.hackerrank.monthpreparation.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterGameTest {

    CounterGame counterGame;
    @BeforeEach
    void setUp() {
        counterGame = new CounterGame();
    }

    @Test
    void should_returnLouiseForGivenInput() {
        assertEquals("Louise", counterGame.counterGame(132));
    }

    @Test
    void should_returnForALargeInteger() {
        assertEquals("Richard", counterGame.counterGame((long)Math.pow(2,60)));
    }
}