package com.learn.gupao.singletonpattern.lazy;

public class SingletonAsDoubleCheck {

    private SingletonAsDoubleCheck(){};

    private static SingletonAsDoubleCheck singletonAsDoubleCheck;

    public static SingletonAsDoubleCheck getInstance() {
        if(singletonAsDoubleCheck == null){
            synchronized (SingletonAsDoubleCheck.class){
                if(singletonAsDoubleCheck == null){
                    singletonAsDoubleCheck = new SingletonAsDoubleCheck();
                }
            }
        }
        System.out.println("hahah");
        return singletonAsDoubleCheck;
    }
}
