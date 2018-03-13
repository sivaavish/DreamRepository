package com.Thread;

public class MyThread extends Thread {
   /* public void run(){
        //System.out.println("Thread is Running...");
        for(int i=1 ;i<=10;i++){
            System.out.println("child Thread....");
        }
    }*/
    public static void main(String args[]){
        try{
            ChildThread t=new ChildThread();
            t.start();
            t.join();
            for(int i=1;i<=10;i++){
                System.out.println("Parent Thread...");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}