package com.serializable;

import java.io.*;

public class SerializableEx {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        SerialiableClass s=new SerialiableClass();
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        SerialiableClass s1=(SerialiableClass)ois.readObject();
        System.out.println(s1.i+"/////////////"+s1.j);



    }
}
