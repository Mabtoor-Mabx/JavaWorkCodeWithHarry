package com.company;
public class Simple2 {
    public static void main(String[] args){

        String name = "Mabtoor Ul Shafiq";
        int age = 20;
        int marks1 =  83;
        int marks2 = 98;
        int marks3 = 97;
        int marks4 = 98;
        int marks5 = 96;
        int obtMarks  =  marks1+ marks2 + marks3 + marks4 + marks5;
        double totalMarks = 500;
        double  percent = obtMarks/totalMarks*100;

        System.out.println("Student Name");
        System.out.println(name);
        System.out.println("Student Age");
        System.out.println(age);
        System.out.println("Total Marks");
        System.out.println(totalMarks);
        System.out.println("Obtained Marks");
        System.out.println(obtMarks);
        System.out.println("Percentage of Student is");
        System.out.println(percent);


    }
}
