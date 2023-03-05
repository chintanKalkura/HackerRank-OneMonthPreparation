package org.practice.hackerrank.monthpreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class TestBase {

    /**
     * @param floor The minimum value in the list. Inclusive.
     * @param ceil  The maximum value in the list. Inclusive.
     * @param minSizeLimit The minimum size of the list. Inclusive.
     * @param maxSizeLimit The maximum size in the list. Inclusive.
     * @return A list of randomly generated Integers
     */
    protected List<Integer> randomlyGenerateListOfIntegers(int floor, int ceil,
                                                           int minSizeLimit, int maxSizeLimit) {
        Random random = new Random();
        int size = random.nextInt(minSizeLimit,maxSizeLimit+1);

        List<Integer> array = new ArrayList<>(size);
        IntStream.range(0,size).forEach(i->
                array.add(random.nextInt(floor,ceil+1))
        );

        return array;
    }
}
