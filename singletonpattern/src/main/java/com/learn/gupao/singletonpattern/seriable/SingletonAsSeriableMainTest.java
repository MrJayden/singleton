package com.learn.gupao.singletonpattern.seriable;

import java.io.*;

public class SingletonAsSeriableMainTest {
    public static void main(String[] args) {
        SingletonAsSeriableMainTest.testDestorySingleton();
    }

    public static void testDestorySingleton(){
        SingletonAsSeriable seriable1 = SingletonAsSeriable.getInstance();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("tt.text");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(seriable1);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("tt.text");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //
            SingletonAsSeriable singleton2 = (SingletonAsSeriable) ois.readObject();
            ois.close();
            System.out.println(singleton2 ==seriable1);





        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testSingleton(){
        SingletonAsSeriable singletonAsSeriable = SingletonAsSeriable.getInstance();
        SingletonAsSeriable singletonAsSeriable1 = SingletonAsSeriable.getInstance();
        System.out.println(singletonAsSeriable == singletonAsSeriable1);
    }
}
