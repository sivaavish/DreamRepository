package com.hackerRank;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String args[])throws IOException{
       /* StringTokenizer st=new StringTokenizer("He is a very very good boy, isn't he?");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }*/
        String s="He is a very very good boy, isn't he?";
        String[] a = s.trim().split("[ !,?._'@]+");
        System.out.println(a);
        ArrayList<String> list=new ArrayList<String>(Arrays.asList(a));
        System.out.println(list.size());
        for (String str:list){
            System.out.println(str);
        }
    }
}
