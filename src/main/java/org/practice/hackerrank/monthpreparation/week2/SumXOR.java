package org.practice.hackerrank.monthpreparation.week2;

public class SumXOR {

    public long sumXor(long n) {
        // Write your code here
        int count =0;

        for(long i=0; i<=n ; i++) {
            long sum = n+i;
            long xor = n^i;

            if(sum == xor) {
                count++;
            }
        }

        return count;
    }
}
