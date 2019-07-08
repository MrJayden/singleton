package com.learn.gupao.singletonpattern.lazy;

public class SingletonAsInnerClassMainTest {
    public static void main(String[] args) {
        SingletonAsInnerClass singletonAsInnerClass = SingletonAsInnerClass.getInstance();
        SingletonAsInnerClass singletonAsInnerClass1 = SingletonAsInnerClass.getInstance();
        System.out.println(singletonAsInnerClass);
        System.out.println(singletonAsInnerClass1);
        System.out.println(singletonAsInnerClass == singletonAsInnerClass1);
    }
}
