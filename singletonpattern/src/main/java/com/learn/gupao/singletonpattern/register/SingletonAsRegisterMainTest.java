package com.learn.gupao.singletonpattern.register;

import com.learn.gupao.singletonpattern.lazy.SingletonAsSimple;

public class SingletonAsRegisterMainTest {
    public static void main(String[] args) {
        HelloWorld object = (HelloWorld)SingletonAsRegister.getBean("com.learn.gupao.singletonpattern.register.HelloWorld");
        object.sayHello();
        System.out.println("#######################################");
        HelloWorld object2 = (HelloWorld)SingletonAsRegister.getBean("com.learn.gupao.singletonpattern.register.HelloWorld");
        object.sayHello();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        HelloWorld object3 = (HelloWorld)SingletonAsRegister.getBean("com.learn.gupao.singletonpattern.register.HelloWorld");
        object.sayHello();
    }
}
