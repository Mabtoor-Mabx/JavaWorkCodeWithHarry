package com.company;
import java.util.Scanner;
public class CBSE{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Your Roll No");
        int roll = sc.nextInt();
        System.out.println("Enter Math Marks");
        float math = sc.nextFloat();
        System.out.println("Enter English Marks");
        float english = sc.nextFloat();
        System.out.println("Enter Urdu Marks");
        float urdu = sc.nextFloat();
        System.out.println("Enter Science Marks");
        float science = sc.nextFloat();
        System.out.println("Enter IS/PS marks");
        float IsOrPs =  sc.nextFloat();
        System.out.println("Your Marks is");
        double obtMarks = english+urdu+math+IsOrPs+science;
        System.out.println(obtMarks);
        double total = 500;
        double percent = obtMarks/total*100;
        System.out.println("Your Percentage is");
        System.out.println(percent);
        if (obtMarks >=300 ) {
            System.out.println(" Congratulation You Are Pass");

        }
        else{
            System.out.println("Alas! You Are Fail");
        }


    }
}