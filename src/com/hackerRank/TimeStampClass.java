package com.hackerRank;

import java.io.IOException;
import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TimeStampClass {
    /*
    * Two ways to get Timestamp
    * */
    public static SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
    public static void main(String args[])throws IOException {

        Timestamp timestamp=new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
        System.out.println(sdf.format(timestamp));

        Date date=new Date();
        System.out.println(date);
        System.out.println(new Timestamp(date.getTime()));



    }
}
