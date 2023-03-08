package org.practice.hackerrank.monthpreparation.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {

    DynamicArray dynamicArray;
    @BeforeEach
    void setUp() {
        dynamicArray = new DynamicArray();
    }

    @Test
    public void should_returnAnswersArrayForGivenInput() throws DynamicArrayException {
        int n = 2;
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(Arrays.asList(1,0,5));
        queries.add(Arrays.asList(1,1,7));
        queries.add(Arrays.asList(1,0,3));
        queries.add(Arrays.asList(2,1,0));
        queries.add(Arrays.asList(2,1,1));

        assertEquals(Arrays.asList(7,3), dynamicArray.dynamicArray(n,queries));
    }

    @Test
    public void should_throwException_whenAQueryIsInvalid() {
        int n = 2;
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(Arrays.asList(1,0,5));
        queries.add(Arrays.asList(2,5,10));
        queries.add(Arrays.asList(2,1,1));

        assertThrows(DynamicArrayException.class,()-> dynamicArray.dynamicArray(n,queries));
    }

    @Test
    public void should_throwException_whenAQueryIsInvalid_andIncludeOriginalException() {
        int n = 2;
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(Arrays.asList(1,0,5));
        queries.add(Arrays.asList(2,5,10));
        queries.add(Arrays.asList(2,1,1));

        try{
            dynamicArray.dynamicArray(n,queries);
        }
        catch(DynamicArrayException ex) {
            assertEquals( ArithmeticException.class, ex.getException().getClass());
            return;
        }
        fail();
    }

}