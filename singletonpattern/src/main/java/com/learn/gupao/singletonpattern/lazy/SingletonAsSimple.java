package com.learn.gupao.singletonpattern.lazy;

public class SingletonAsSimple {

    private SingletonAsSimple (){}

    private static SingletonAsSimple singletonAsSimple;

    public synchronized static SingletonAsSimple getInstance(){

        if(singletonAsSimple ==null){
            System.out.println("将会实现一个新的实例");
            singletonAsSimple = new SingletonAsSimple();
        }
        return singletonAsSimple;
    }
}
