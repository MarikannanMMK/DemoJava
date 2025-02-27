package com.mmk;


@FunctionalInterface
public interface TestInterface {


    String name ="Marikannan";

    String append(String name);

    default String demo(String name){
        return "Hello " + name ;
    }

    static String demo2(String name){
       return "Welcome from static" + name;
    }
}
