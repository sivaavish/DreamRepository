package com.Collection;

import java.util.Scanner;

public class HelloClas extends Thread{
    public static void main(String args[])throws Exception {
        HelloClas helloClas=new HelloClas();
        Thread thread=new Thread(helloClas);
        thread.start();

    }
    public void run(){

        try {
            System.out.println("Thread signal is Yellow>>>>");
            Thread.sleep(3000);
            System.out.println("Thread signal is Green>>>>");
            Thread.sleep(3000);
            System.out.println("Thread signal is Red>>>>");
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }


}
