package str;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.StringTokenizer;

public class StringClass {
    public static void main(String args[])throws Exception{

        //Dateformat
        Date date=new Date();
        SimpleDateFormat sf=new SimpleDateFormat("dd/mm/yyyy");
        String s=sf.format(date);
        System.out.println(s);
    }
}
