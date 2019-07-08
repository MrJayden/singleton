package com.learn.gupao.singletonpattern.seriable;

import java.io.Serializable;

public class SingletonAsSeriable implements Serializable {
    private SingletonAsSeriable(){};
    private final static SingletonAsSeriable singletonAsSeriable = new SingletonAsSeriable();

    public static SingletonAsSeriable getInstance(){
        return singletonAsSeriable;
    }

    public Object readResolve(){
        return singletonAsSeriable;
    }

}
