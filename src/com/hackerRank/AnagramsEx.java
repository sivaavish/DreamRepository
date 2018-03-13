package com.hackerRank;

import java.util.Arrays;

public class AnagramsEx {
    public static void main(String args[]){
        String s="siva";
        String s1="avis";
        //System.out.println(s.toCharArray());
        char[] c=s.toCharArray();
        Arrays.sort(c);
        char[] d=s1.toCharArray();
        Arrays.sort(d);
       String a=new String(c);
       String b=new String(d);
        if(a.equals(b)){
            System.out.println("equals......");
        }else{
            System.out.println("Not equals.....");
        }


    }
}
