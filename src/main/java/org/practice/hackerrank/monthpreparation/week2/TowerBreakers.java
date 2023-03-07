package org.practice.hackerrank.monthpreparation.week2;

public class TowerBreakers {

    public int towerBreakers(int n, int m) throws UnsupportedOperationException{

        if(n < 1 || n > 1000000 || m < 1 || m > 1000000)
            throw new UnsupportedOperationException("Inputs are out of bounds.");

        // if size of towers is 1, regardless of the number of towers. There is no first move for player 1.
        // hence Player 2 wins.
        if(m == 1) {
            return 2;
        }
        //If there is only one tower then Player 1 will reduce the size of the tower to 1 as
        // players always choose optimally. Hence there will be no move left for Player 2.
        if(n == 1) {
            return 1;
        }

        // As players always choose optimally,It is just about the number of towers as after every turn
        // each player will reduce the size of the tower to 1.
        return n % 2 == 0 ? 2 : 1;

    }
}
