package com.hackerRank;

import str.Testing;

public class TestingEx extends AbstractClass {
    @Override
    void run() {
        System.out.println("Hello This is TestEx Class");
    }

     public void display(){
        System.out.println("Display Method TestEx Class>>>>>");
     }

    public static void main(String args[]){
        TestingEx test=new TestingEx();
        test.display();
        test.run();
    }

}
