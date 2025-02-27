package com.mmk;

public class testInterfaceMain {
    public static void main(String[] args) {

        String name = "Marikannan";

        TestInterface t = (x)-> {return "Hello " + x;};


        String welcome = t.append(name);

        System.out.println(welcome);

       String Welcome2 =  t.demo(name);

        System.out.println(Welcome2);

        String Welcome3 = TestInterface.demo2(name);

        System.out.println(Welcome3);


    }
}
