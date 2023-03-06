package org.practice.hackerrank.monthpreparation.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawingBookTest {

    @Test
    public void should_returnPageCountForGivenInput() {
        int n = 5;
        int p = 3;

        DrawingBook drawingBook = new DrawingBook();

        int result = drawingBook.pageCount(n,p);

        assertEquals(1,result);
    }

}