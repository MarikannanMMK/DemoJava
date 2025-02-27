package com.mmk;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        ArrayList<Employee> arr =  new ArrayList<Employee>();
        final Employee emp1 = new Employee("MMK",101,1000l);
        Employee emp2 = new Employee("Jass",103,2000l);
        Employee emp3 = new Employee("Raji",102,3000l);
        Employee emp4 = new Employee("Vimal",104,3000l);

emp1.setName("MArikannan");

//emp1 =emp2;

        System.out.println(emp1.getName());
        arr.add(emp1);
        arr.add(emp2);
        arr.add(emp3);
        arr.add(emp4);


//        arr.stream()
//                .filter(employee -> employee.getId()>102)
//                .filter(employee -> employee.getSalary()>1500l)
//                .map(employee -> employee.getName())
//                .forEach(System.out::println);

        int a = 10;
        int b = - 15;
        int temp = 0;


//        a = (a^b);
//
//        b = (a^b);
//
//        a = (a^b);
//

        a = a+b;
        b = a-b;
        a = a-b;




        System.out.println("a =" + a +
                "b =" + b);

//        arr.stream()
//               // .filter(employee -> employee.getSalary())
//                .map(employee -> employee.getSalary())
//                .forEach(System.out::println);
//        Set<Long> sal =  arr.stream()
//                // .filter(employee -> employee.getSalary())
//                .map(employee -> employee.getSalary())
////                .forEach(System.out::println);
//                .collect(Collectors.toSet());
//
//        sal.stream().forEach(System.out::println);



String s1 = "Marikannan";


        StringTokenizer st = new StringTokenizer(s1,"a");

        System.out.println(st.countTokens());


        LinkedList<String> linkedli = new LinkedList<String>();
        // Appending elements at the end of the list
        linkedli.add("Cherry");
        linkedli.add("Chennai");
        linkedli.add("Bullet");

        Collections.reverse(linkedli);

        System.out.println(linkedli.toString());

        linkedli.stream();


        String s = "Marikannan is a Developer";


        Map<Character,Long> frequency = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));




        s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));




    }


}
