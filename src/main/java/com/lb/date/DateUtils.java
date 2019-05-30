package com.lb.date;


import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtils {

    public static String DEFAULT_FORMAT = "YYYY-MM-DD HH:MM:SS";

    /**
     * 格式化日期
     * @param date 日期对象
     * @return String 日期字符串
     */
    public static String formatDate(Date date){
        SimpleDateFormat f = new SimpleDateFormat(DEFAULT_FORMAT);
        String sDate = f.format(date);
        return sDate;
    }

    /**
     * 格式化日期
     * @param str 日期对象
     * @return String 日期字符串
     */
    public static Date formatDate(String str){
        Date date = null;
        try{
            SimpleDateFormat f = new SimpleDateFormat(DEFAULT_FORMAT);
            date = f.parse(str);
        }catch (Exception e){
            e.printStackTrace();
        }
        return date;
    }
}