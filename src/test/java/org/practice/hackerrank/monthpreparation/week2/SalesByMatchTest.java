package org.practice.hackerrank.monthpreparation.week2;

import org.junit.jupiter.api.Test;
import org.practice.hackerrank.monthpreparation.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesByMatchTest extends TestBase {

    @Test
    public void should_returnPairsOfSocksInTheGivenInputList() {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,2,1,2,3,1));

        SalesByMatch salesByMatch = new SalesByMatch();
        int actual = salesByMatch.sockMerchant(arr.size(), arr);

        assertEquals(2, actual);
    }

    @Test
    public void should_returnPairsOfSocksForARandomlyGeneratedInput() {
        List<Integer> arr = randomlyGenerateListOfIntegers(1, 100, 1 ,100);

        SalesByMatch salesByMatch = new SalesByMatch();
        int actual = salesByMatch.sockMerchant(arr.size(), arr);

        System.out.println(actual);
    }


}