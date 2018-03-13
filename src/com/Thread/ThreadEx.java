package com.Thread;

import java.io.IOException;

public class ThreadEx extends Thread {
    public static void main(String args[])throws IOException {
        ThreadEx t = new ThreadEx();
        t.start();
        for (int i = 0; i < 5; i++){
            System.out.println("Parent Thread" +i);
        }

    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("child Thread"+i);
        }

    }

    /*
    * new Thread created
    * running
    * runnable
    * waiting
    * destroy
    * */

}

