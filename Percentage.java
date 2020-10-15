package com.company;
import java.util.Scanner;
public class Percentage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Your Roll No");
        int roll = sc.nextInt();
        System.out.println("Enter Obtained Marks");
        int obtMarks = sc.nextInt();
        System.out.println("Enter Total Marks");
        double total = sc.nextDouble();
        double percent =  obtMarks/total*100;
        System.out.println("Your Percentage is");
        System.out.println(percent);




    }
}