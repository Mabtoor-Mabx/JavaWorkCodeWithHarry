package com.company;

public class Program {
    public static void main(String[] args){
        System.out.println("The Marks Of Student is ");
        double marks = 500;
        double  legal= 0;
        int marks1 = 64;
        int marks2 = 76;
        int marks3 = 87;
        int marks4 = 90;
        int marks5 = 94;
        double obtMarks = marks1+marks2+marks3+marks4+marks5;
        legal = obtMarks/marks * 100;
        System.out.print(obtMarks);
        System.out.println("Out Off 500 Marks");
        System.out.println(legal);

    }
}
