package com.company;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;

public class GregCal {


    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        Calendar calenderChecker = Calendar.getInstance();

        calendar.set(1997, Calendar.APRIL,20);
        // get the
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.getTime());
        // add 1 month 8 days
        calendar.add(Calendar.MONTH,1);
        calendar.add(Calendar.DAY_OF_MONTH,8);
        System.out.println(calendar.getTime());
        Locale.setDefault(Locale.CANADA);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.add(calendar.DAY_OF_MONTH, 10);
        System.out.println("Day of week: " + weekday);
        System.out.println("Day of month: " + day);
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.MONTH));
        calenderChecker.set(1997,Calendar.JULY,10,20,10,55);
        int prevMonth = calenderChecker.get(Calendar.MONTH);
        int prevDayOfMonth = calenderChecker.get(Calendar.DAY_OF_MONTH);
        int currMonth = calendar.get(Calendar.MONTH);
        int currDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(currDayOfMonth);
        System.out.println(currMonth);
        System.out.println(prevDayOfMonth);
        System.out.println(prevMonth);
        if(currMonth <= prevMonth+1 && currDayOfMonth <= prevDayOfMonth){
            System.out.println("Payment time");
        }

        // get - set - add
        Currency currency = Currency.getInstance("EUR");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        currencyFormat.setCurrency(currency);
        System.out.println(currencyFormat.format(2.5));

    }
}
