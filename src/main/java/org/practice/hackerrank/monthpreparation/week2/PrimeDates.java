package org.practice.hackerrank.monthpreparation.week2;


import java.time.LocalDate;

public class PrimeDates {

    public int primeDates(LocalDate start, LocalDate end) {
        int result = 0;

        while(!start.equals(end.plusDays(1))) {
            int sum = start.getDayOfMonth();
            sum = sum * 100 + start.getMonthValue();
            sum = sum * 10000 + start.getYear();

            if(sum % 4 == 0 || sum % 7 == 0)
                result += 1;

            start = start.plusDays(1);
        }

        return result;
    }
}
