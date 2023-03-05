package org.practice.hackerrank.monthpreparation.week1;

import org.practice.hackerrank.monthpreparation.TestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlusMinusTest extends TestBase {

    private PlusMinus plusMinus;
    @BeforeEach
    public void setup() {
        plusMinus = new PlusMinus();
    }

    @Test
    public void plusMinus_shouldPrintRatio(){

        List<Integer> arr = new ArrayList<>(Arrays.asList(-1,-2,0,2,3)){};

        List<Double> actual = plusMinus.execute(arr);
        List<Double> expected = Arrays.asList(0.400000,0.400000,0.200000);
        assertEquals(actual,expected);
    }

    @Test
    public void plusMinus_shouldPrintRatio_forRandomGeneratedList(){

        List<Integer> arr = randomlyGenerateListOfIntegers(-100,100, 0,100);

        List<Double> actual = plusMinus.execute(arr);

        List<Double> expected = getRatioForList(arr);

        assertEquals(actual,expected);
    }

    private List<Double> getRatioForList(List<Integer> arr) {
        int plus = 0;
        int minus = 0;
        int zero = 0;
        for(int e : arr) {
            if(e==0)
                zero++;
            else if(e<0)
                minus++;
            else
                plus++;
        }

        return new ArrayList<Double>(Arrays.asList((double)plus/arr.size(),
                (double)minus/arr.size(),
                (double)zero/arr.size()));
    }

}