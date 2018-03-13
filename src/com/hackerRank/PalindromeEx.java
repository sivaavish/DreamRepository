package com.hackerRank;
import java.io.*;
import java.util.Scanner;

public class PalindromeEx {
    public static void main(String args[])throws IOException{
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String temp=s;
        //System.out.println(temp);
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
            s1=s1+s.charAt(i);
        }
        if (temp.equals(s1)){
            System.out.println("Palindrome String...");
        }else{
            System.out.println("Not Palindrome String....");
        }
    }
}
