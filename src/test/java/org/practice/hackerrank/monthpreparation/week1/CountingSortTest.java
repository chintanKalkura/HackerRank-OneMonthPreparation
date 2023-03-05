package org.practice.hackerrank.monthpreparation.week1;

import org.junit.jupiter.api.Test;
import org.practice.hackerrank.monthpreparation.TestBase;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest extends TestBase {

    @Test
    public void should_returnTheFrequencyOfNumbersInTheGivenArray() {
        CountingSort countingSort = new CountingSort();

        List<Integer> result = countingSort.countingSort(Arrays.asList(1,1,1,3,4));

        int[] expected = new int[100];
        expected[1] = 3;
        expected[3] = 1;
        expected[4] = 1;

        assertIterableEquals(Arrays.stream(expected).boxed().toList(), result);
    }

    @Test
    public void should_returnTheFrequencyOfNumbersInARandomNumber() {
        CountingSort countingSort = new CountingSort();

        List<Integer> input = randomlyGenerateListOfIntegers(0,99,
                100,1000000);

        List<Integer> actual = countingSort.countingSort(input);

        int[] frequency = new int[100];

        input.stream().forEach(e->frequency[e]++);

        List<Integer> expected = Arrays.stream(frequency).boxed().toList();

        assertIterableEquals(expected, actual);

    }

}