package com.company;
import java.util.Scanner;
public class TestPractices{
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = 12;
//        int b = 22;
//        int c = 65;
//        int d = a+b+c;
//        System.out.println(d);


        float a = 43;
        float b = 42;
        float c = 45;
        float d = (a+b+c)/30;
        System.out.println(d);

        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println( "Hello" + " " +  name  + " " +  "Have A Good Day");

        System.out.println("Enter KM value");
        float km = sc.nextFloat();
        double mile = km *  0.621371;

        System.out.println("Your Value In Miles Is" + mile);

        System.out.println(sc.hasNext());



    }
}