package com.learn.gupao.singletonpattern.hungry;

public class SingletonAsStaticHungryMainTest {

    public static void main(String[] args) {
        SingletonAsStaticHungry singletonAsStaticHungry = SingletonAsStaticHungry.getInstance();

        SingletonAsStaticHungry singletonAsStaticHungry2 = SingletonAsStaticHungry.getInstance();

        System.out.println(singletonAsStaticHungry == singletonAsStaticHungry2);
    }
}
