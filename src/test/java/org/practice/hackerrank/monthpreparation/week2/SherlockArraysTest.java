package org.practice.hackerrank.monthpreparation.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SherlockArraysTest {

    SherlockArrays sherlockArrays;
    @BeforeEach
    void setUp() {
        sherlockArrays = new SherlockArrays();
    }

    @Test
    void should_returnNoForGivenInput(){
        assertEquals("NO", sherlockArrays.balancedSums(Arrays.asList(1,2,3)));
    }

    @Test
    void should_returnYesForGivenInput(){
        assertEquals("YES", sherlockArrays.balancedSums(Arrays.asList(1,2,3,3)));
    }
}