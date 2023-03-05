package org.practice.hackerrank.monthpreparation.week1;

public class TimeConversion {
    public String convert(String s) {
        // Write your code here
        String meridiem = s.substring(s.length()-2);
        String hour = s.substring(0,2);

        StringBuilder result = new StringBuilder();

        if(meridiem.equals("AM")) {
            if(hour.equals("12")) {
                result.append("00");
            }
            else {
                result.append(hour);
            }
            result.append(s, 2, s.length()-2);
        }
        else {
            if(hour.equals("12")) {
                result.append("12");
            }
            else {
                result.append(String.valueOf(Integer.parseInt(hour)+12));
            }
            result.append(s, 2, s.length()-2);
        }

        return result.toString();
    }
}
