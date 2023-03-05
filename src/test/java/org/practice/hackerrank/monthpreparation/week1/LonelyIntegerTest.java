package org.practice.hackerrank.monthpreparation.week1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LonelyIntegerTest {

    @Test
    public void should_returnTheLonelyIntegerFromGivenList(){

        LonelyInteger lonelyInteger = new LonelyInteger();

        int actual = lonelyInteger.lonelyinteger(Arrays.asList(1,2,3,4,3,2,1));

        assertEquals(4,actual);

    }

}