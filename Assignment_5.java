package com.company;
import java.util.Scanner;
public class Assignment_5 {
    public static void main(String[] args) {
//        int a = 10;
//        if (a ==11){
//            System.out.println("I am 11");
//        }
//        else
//        {
//            System.out.println("I am Not 11");
//        }

Scanner sc = new Scanner(System.in);
//        System.out.println("Enter English Marks");
//        float eng = sc.nextFloat();
//        System.out.println("Enter Urdu Class");
//        float urd = sc.nextFloat();
//        System.out.println("Enter Science Marks");
//        float sci = sc.nextFloat();
//        float avg = (eng+urd+sci)/3;
//        if(avg >=40 && eng>=33 && urd>=33 && sci>=33){
//            System.out.println(" Congratulations! You Are Pass");
//        }
//        else
//        {
//            System.out.println("Sorry! Bad Luck Next Time");
//        }

        System.out.println("Enter Income");
        float income = sc.nextFloat();

        float tax = 0.0f;
        if(income<2.5f){
            tax = tax +0;
            System.out.println(tax);
        }
        else if(income>=2.5f && income<=5.0f){
            tax = 0.05f * (income-2.5f);
            System.out.println(tax);
        }
        else if (income>5.0 && income<=10.0f){
            tax = 0.2f * (income-5.0f);
            System.out.println(tax);
        }
        else if (income>10){
            tax = 0.3f * (income-10.0f);
            System.out.println(tax);
        }


    }
}
