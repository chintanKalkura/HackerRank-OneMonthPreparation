package org.practice.hackerrank.monthpreparation.week2;

public class DrawingBook {

    public int pageCount(int n, int p) {
        // Write your code here
        // int diff = Math.min(p%2==0 ? p-1-1 : p-1,
        // n%2==0 ? n-1-p : n-p);

        // return (n%2 == 0) ? (diff/2)+1 : diff/2;
        int distFromFront = 0;
        int index = 1;

        while(index < p) {
            index+=2;
            distFromFront++;
        }

        int distFromEnd = 0;
        index = n%2==0 ? n : n-1;

        while(index > p) {
            index-=2;
            distFromEnd++;
        }

        return Math.min(distFromEnd, distFromFront);
    }
}
