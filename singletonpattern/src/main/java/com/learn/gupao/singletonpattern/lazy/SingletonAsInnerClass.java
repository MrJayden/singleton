package com.learn.gupao.singletonpattern.lazy;

public class SingletonAsInnerClass {

    private SingletonAsInnerClass(){
        if(InnerClass.singletonAsInnerClass != null){
            throw new RuntimeException("不允许重复创建类");
        }
    }

    public static final SingletonAsInnerClass getInstance() {
         return InnerClass.singletonAsInnerClass;
    }

    private static final class InnerClass{
        private static final SingletonAsInnerClass singletonAsInnerClass = new SingletonAsInnerClass();
    }
}
