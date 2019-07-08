package com.learn.gupao.singletonpattern.threadlocal;

public class SingletonAsThradeLocal {

private static final ThreadLocal<SingletonAsThradeLocal> singletonAsThreadLocal = new ThreadLocal<SingletonAsThradeLocal>(){
    @Override
    protected SingletonAsThradeLocal initialValue() {
        return new SingletonAsThradeLocal();
    }
};
    public static SingletonAsThradeLocal getInstance(){
        return singletonAsThreadLocal.get();
    }

}
