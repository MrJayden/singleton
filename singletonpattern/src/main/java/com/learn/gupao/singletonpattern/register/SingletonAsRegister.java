package com.learn.gupao.singletonpattern.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SingletonAsRegister {
    private SingletonAsRegister(){};
    private static Map<String,Object> beanContainer = new ConcurrentHashMap<>();

    public static Object getBean(String className){

        synchronized (beanContainer ){
            if(!beanContainer.containsKey(className)){
                Object obj = null;
                try {
                    obj =  Class.forName(className).newInstance();
                    beanContainer.put(className,obj);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                System.out.println("---------------------is null --------------------");
                return obj;
            }else{
                return beanContainer.get(className);
            }
        }
    }
}
