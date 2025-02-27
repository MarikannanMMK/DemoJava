package com.mmk;

public class ClassA {

   static void display(String s) {
       int num;
//       System.out.println("The number is :" + num);
       System.out.println(" String arguments ");

    }

   static void display(Object o) {

        System.out.println(" Object arguments ");

    }

    public static void main(String[] args) {

        display(null);

    }

}

