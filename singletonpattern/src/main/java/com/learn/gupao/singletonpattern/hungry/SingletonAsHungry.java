package com.learn.gupao.singletonpattern.hungry;

public class SingletonAsHungry {

    private SingletonAsHungry(){

    }

    private final static SingletonAsHungry  singletonAsHungry = new SingletonAsHungry();

    public static SingletonAsHungry getInstance(){
        return singletonAsHungry;
    }
}
