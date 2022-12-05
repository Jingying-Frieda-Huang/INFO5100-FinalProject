/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

/**
 *
 * @author friedahuang
 */
public class CurrentDate {

    public static int removeLeadingZero(String str) {

        return str.charAt(0) == '0' ? Integer.parseInt(str.charAt(1) + "") : Integer.parseInt(str);

    }

    public static Date getCurrentDate() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        
        int year = Integer.parseInt(dtf.format(now).substring(0, 4));

        String month = dtf.format(now).substring(5, 7);
        int convertedMonth = removeLeadingZero(month);

        String day = dtf.format(now).substring(8, 10);
        int convertedDay = removeLeadingZero(day);

        String hour = dtf.format(now).substring(11, 13);
        int convertedHour = removeLeadingZero(hour);

        String min = dtf.format(now).substring(14, 16);
        int convertedMin = removeLeadingZero(min);

        return new Date(year, convertedMonth, convertedDay, convertedHour, convertedMin);
    }
}
