package org.practice.hackerrank.monthpreparation.week2;

public class CounterGame {

    public String counterGame(long n) {
        // Write your code here
        int moves = 0;

        while(n != 1) {
            long pow = 1;
            while(pow < n) {
                pow *= 2;
            }
            pow /= 2;
            if(pow == n)
                n /= 2;
            else {
                n = (n-pow);
            }
            moves++;
        }

        return moves % 2 != 0 ? "Louise" : "Richard";
    }
}
