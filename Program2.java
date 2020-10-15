package com.company;

public class Program2 {
public static void main (String[] args){
    double total = 400;
    String ch = "Mabtoor Mabx";
    int marks1 = 89;
    int marks2 = 97;
    int marks3 = 96;
    int marks4  = 99;
    int obtMarks = marks1+marks2+marks3+marks4;
    double totalMarks = obtMarks/total;
    double percent = totalMarks*100;
    System.out.println("Student Name");
    System.out.println(ch);
    System.out.println("Total Marks");
    System.out.println(total);
    System.out.println("Obtained Marks Of Students is");
    System.out.println(obtMarks);
    System.out.println("Percentage Of Student is");
    System.out.println(percent);
}
}
