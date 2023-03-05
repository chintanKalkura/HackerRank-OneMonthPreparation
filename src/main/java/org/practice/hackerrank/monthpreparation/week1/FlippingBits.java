package org.practice.hackerrank.monthpreparation.week1;

public class FlippingBits {

    public long flippingBits(long n) {
        // Write your code here
        return n ^ (((long)Integer.MAX_VALUE * 2) + 1);
    }
}
