package com.learn.gupao.singletonpattern.hungry;

public class SingletonAsStaticHungry {

    private SingletonAsStaticHungry(){

    }

    private  static SingletonAsStaticHungry singletonAsStaticHungry;

    static{
        singletonAsStaticHungry = new SingletonAsStaticHungry();
    }

    public static SingletonAsStaticHungry getInstance(){
        return singletonAsStaticHungry;
    }
}
