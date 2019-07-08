package com.learn.gupao.singletonpattern.lazy;

public class singletonAsSimpleMainTest {
    public static void main(String[] args) {
        SingletonAsSimple singletonAsSimple = SingletonAsSimple.getInstance();
        SingletonAsSimple singletonAsSimple1 = SingletonAsSimple.getInstance();
        SingletonAsSimple singletonAsSimple2 = SingletonAsSimple.getInstance();
        System.out.println(singletonAsSimple);
        System.out.println(singletonAsSimple1);
        System.out.println(singletonAsSimple2);
        System.out.println(singletonAsSimple == singletonAsSimple1);
    }
}
