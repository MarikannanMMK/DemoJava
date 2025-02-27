package com.mmk;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stram_practice {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

      List<Student> filter_NAME =   list.stream()
                .filter(student -> student.getFirstName().startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(filter_NAME.toString());


        Map<String , List <Student>> byDeptname =  list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));

        System.out.println(byDeptname.toString());


        OptionalInt age = list.stream().mapToInt(student -> student.getAge()).max();

        System.out.println(age);


        Map<String , Long> dept_name_count =  list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.counting()));

        System.out.println(dept_name_count.toString());


        String demo = "Marikannan is developer";



        char[] demo_char =  demo.toCharArray();

        List demo_123 = Arrays.asList(demo_char);

//        Map<Character,Integer> frequency_Counting = (Map<Character, Integer>) demo_123.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<Character,Long> frequency_Counting = demo.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(frequency_Counting.toString());

        Map<String,Double> avg_agev = list.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));
        System.out.println(avg_agev.toString());

      Map.Entry<String, Long> MAX_DEPT =  list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();

      System.out.println(MAX_DEPT.toString());

     List<Student> DEL =  list.stream()
              .filter(student -> student.getCity().equals("Delhi"))
              .sorted(Comparator.comparing(Student::getFirstName))
              .collect(Collectors.toList());

      System.out.println(DEL.toString());

     Map<String,Double> AVF_INT =  list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.averagingInt(Student::getRank)));
      System.out.println(AVF_INT.toString());

      Map<String, Optional<Student>> rank_by_student =  list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.minBy(Comparator.comparing(Student::getRank))));

      System.out.println(rank_by_student.toString());

     // list.stream().sorted(Comparator.comparing(Student::getFirstName).reversed()).forEach(System.out::println);

      Student rank_2 = list.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();

      System.out.println(rank_2.toString());


         list.stream().filter(Student -> Student.getCity() == "Kerala").map(student -> student.getCity() + " food").forEach(System.out::println);



         List<String> departmentname = list.stream().map(student -> student.getDepartmantName()).collect(Collectors.toList());

        Map<Integer,Set<String>> dpet_length =  departmentname.stream().collect(Collectors.groupingBy(String::length,Collectors.toSet()));

        System.out.println(dpet_length.toString());



         long count = list.stream().filter(student -> student.getAge() >=25 && student.getDepartmantName().equalsIgnoreCase("Mechanical Engineering")).count();


        System.out.println("List of student age above 25 and Department Mechanical Engineering " + count );

        Map<String,Long> count_By_Department = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.counting()));

        System.out.println("students count by department "+ count_By_Department);



       Student max_Age_Student =  list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).limit(1).findFirst().get();

        System.out.println(max_Age_Student.toString());


       List<Integer> markValues = Arrays.asList(1,2,3,4,5,6,7,8);

       Integer sumUsingReduce = markValues.stream().reduce(0,(a1, a2)->a1+a2);

       int sum = markValues.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sumUsingReduce);
        System.out.println(sum);


       int maxValue =  markValues.stream().max(Comparator.naturalOrder()).get();

        System.out.println("Max_value " + maxValue);


        Long studentNameStartsWithACount =  list.stream().filter(student -> student.getFirstName().startsWith("o",1)).count();
        System.out.println("studentNameStartsWithACount " + studentNameStartsWithACount);

        list.stream().map(student -> student.getFirstName().toUpperCase()).forEach(System.out::println);

      Long evenAgeCount =   list.stream().filter(student -> student.getAge() % 2 == 0).count();
        System.out.println("evenAgeCount "+ evenAgeCount );

        List<Double> markValuesInFloat = Arrays.asList(1.2,2.3,3.4,4.5,5.6,6.7,7.8,8.9);

        double asDouble = markValuesInFloat.stream().mapToDouble(Double::doubleValue).average().getAsDouble();

       String name_concate =  list.stream().map(student -> student.getFirstName()).collect(Collectors.joining(","));

        System.out.println(asDouble);

        System.out.println(name_concate);

        list.stream().map(student -> student.getDepartmantName()).distinct().forEach(System.out::println);


        list.stream().sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getAge)).forEach(System.out::println);


        int[] numbers = {1,2,3,3,4,4,4,5,6,7,7,8,9,9,9,8,8,7,7,7};


         Arrays.stream(numbers).boxed().collect(Collectors.groupingBy(n->n,Collectors.counting()))
                 .entrySet().stream().filter(e->e.getValue()>1)
                 .map(Map.Entry::getKey).forEach(System.out::println);


         String[] words = {"hello","level","deed","world"};

         Arrays.stream(words).filter(s->s.equals(new StringBuffer(s).reverse().toString())).forEach(System.out::println);



       Map<String , List<Student>> studentMap =  list.stream().collect(Collectors.groupingBy(student -> student.getRank() < 50 ? "PASS" : "FAIL" ));

        System.out.println(studentMap);


        list.stream().map(Student::getFirstName).sorted(Comparator.comparingInt(String::length).reversed()).forEach(System.out::println);

        list.stream().sorted(Comparator.comparingInt(student -> student.getFirstName().length())).forEach(System.out::println);




    }








}

