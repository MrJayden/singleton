package com.learn.gupao.singletonpattern.lazy;

import java.lang.reflect.Constructor;

public class SingletonAsDoubleCheckMainTest {
    public static void main(String[] args) {
        SingletonAsDoubleCheck singletonAsDoubleCheck = SingletonAsDoubleCheck.getInstance();
        SingletonAsDoubleCheck singletonAsDoubleCheck1 = SingletonAsDoubleCheck.getInstance();
        System.out.println(singletonAsDoubleCheck);
        System.out.println(singletonAsDoubleCheck1);
        System.out.println(singletonAsDoubleCheck == singletonAsDoubleCheck1);

        try {
            Class clazz = SingletonAsDoubleCheck.class;
            Constructor constructor =  clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            SingletonAsDoubleCheck doubleCheck = (SingletonAsDoubleCheck)clazz.newInstance();
            System.out.println("@@@@@@@@@@@@@@@@@@@:"+doubleCheck);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
