package com.mmk;

import java.time.LocalDate;

public class sample {

    static Client c =null;

    static {
        sample s = new sample();
         c =new Client("MMK", LocalDate.of(1999,10,27));
    }



    public static void main(String[] args) {
        System.out.println(sample.c.getClass().toString());
    }
}
