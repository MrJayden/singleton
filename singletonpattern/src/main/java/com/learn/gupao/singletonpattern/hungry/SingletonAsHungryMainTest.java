package com.learn.gupao.singletonpattern.hungry;

public class SingletonAsHungryMainTest {

    public static void main(String[] args) {
        SingletonAsHungry singletonAsHungry = SingletonAsHungry.getInstance();
        SingletonAsHungry singletonAsHungry2 = SingletonAsHungry.getInstance();

        System.out.println(singletonAsHungry);
        System.out.println(singletonAsHungry2);
    }
}
