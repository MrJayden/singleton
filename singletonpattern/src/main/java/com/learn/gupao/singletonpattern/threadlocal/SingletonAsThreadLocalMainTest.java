package com.learn.gupao.singletonpattern.threadlocal;

public class SingletonAsThreadLocalMainTest {
    public static void main(String[] args) {
        System.out.println(SingletonAsThradeLocal.getInstance());
        System.out.println(SingletonAsThradeLocal.getInstance());
        System.out.println(SingletonAsThradeLocal.getInstance());
        System.out.println(SingletonAsThradeLocal.getInstance());
        System.out.println(SingletonAsThradeLocal.getInstance());

    }
}
