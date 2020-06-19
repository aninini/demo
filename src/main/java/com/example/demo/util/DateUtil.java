package com.example.demo.util;

import java.util.Random;

public class DateUtil {

    //随机日期
    public static String randomDate(){
        Random rndYear=new Random();
        int year=rndYear.nextInt(18)+2000;
        Random rndMonth=new Random();
        int month=rndMonth.nextInt(12)+1;
        Random rndDay=new Random();
        int Day=rndDay.nextInt(30)+1;
        Random rndHour=new Random();
        int hour=rndHour.nextInt(23);
        Random rndMinute=new Random();
        int minute=rndMinute.nextInt(60);
        Random rndSecond=new Random();
        int second=rndSecond.nextInt(60);
        return year+"-"+cp(month)+"-"+cp(Day)+"  "+cp(hour)+":"+cp(minute)+":"+cp(second);
    }
    private static String cp(int num){
        String Num=num+"";
        if (Num.length()==1){
            return "0"+Num;
        }else {
            return Num;
        }
    }
}
