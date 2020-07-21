package com.pandey.saurabh.dateutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtils {

    public static String getFormattedDate(String inputDateFormat, String inputDate, String outputFormat) {
        SimpleDateFormat input = new SimpleDateFormat(inputDateFormat, Locale.getDefault());
        SimpleDateFormat output = new SimpleDateFormat(outputFormat, Locale.getDefault());
        String formattedDate = null;
        Date oneWayTripDate;
        try {
            oneWayTripDate = input.parse(inputDate);
            assert oneWayTripDate != null;
            formattedDate = output.format(oneWayTripDate);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return formattedDate;
    }


    public static String getTodayDate(String formatYouWant) {
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat(formatYouWant, Locale.getDefault());
        String strDate = dateFormat.format(c);
        return strDate;
    }


    public static int getHourOfDay(long timeInMillis) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("H", Locale.getDefault());
        return Integer.parseInt(dateFormat.format(timeInMillis));
    }


    public static int getMinute(long timeInMillis) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("m", Locale.getDefault());
        return Integer.parseInt(dateFormat.format(timeInMillis));
    }


    public static String getFirstDateOfMonth(String formatYouWant) {

        Calendar ToCal = Calendar.getInstance();
        Date ToDate = ToCal.getTime();
        SimpleDateFormat ToFormat = new SimpleDateFormat(formatYouWant, Locale.getDefault());
        String formattedDate = ToFormat.format(ToDate);
        return formattedDate;
    }


}
