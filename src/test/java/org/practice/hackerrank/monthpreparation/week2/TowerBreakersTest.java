package org.practice.hackerrank.monthpreparation.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TowerBreakersTest {

    TowerBreakers towerBreakers;
    @BeforeEach
    void setUp() {
        towerBreakers = new TowerBreakers();
    }

    @Test
    public void should_throwExceptionWhenTheBoundsAreNotMet() {

        assertThrows( UnsupportedOperationException.class,()-> towerBreakers.towerBreakers(0,4));

        assertThrows(UnsupportedOperationException.class,()-> towerBreakers.towerBreakers(1,10000000));
    }

    @Test
    public void should_returnWinningPlayerNumberBasedOnInput() {
        assertEquals(1, towerBreakers.towerBreakers(1, 4));

        assertEquals(2, towerBreakers.towerBreakers(2, 2));

        assertEquals(2, towerBreakers.towerBreakers(78, 1000000));
    }
}