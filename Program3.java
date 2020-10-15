package com.company;
import java.util.Scanner;
public class Program3{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Your Roll No");
        int roll = sc.nextInt();

        if (roll == 1) {


            int math = 98;
            int urdu = 96;
            int english = 97;
            int is = 79;
            int science = 95;
            int total = math + urdu + english + is + science;
            System.out.println("Your Marks is");
            System.out.println(total);
        }

            else  if (roll == 2) {


            int math = 93;
            int urdu = 91;
            int english = 94;
            int is = 84;
            int science = 83;
            int total = math + urdu + english + is + science;
            System.out.println("Your Marks is");
            System.out.println(total);
        }

        else  if (roll == 3) {


            int math = 92;
            int urdu = 81;
            int english = 93;
            int is = 73;
            int science = 90;
            int total = math + urdu + english + is + science;
            System.out.println("Your Marks is");
            System.out.println(total);
        }

         else if (roll == 4) {


            int math = 98;
            int urdu = 96;
            int english = 97;
            int is = 79;
            int science = 95;
            int total = math + urdu + english + is + science;
            System.out.println("Your Marks is");
            System.out.println(total);
        }

     else if (roll == 5) {


            int math = 86;
            int urdu = 79;
            int english = 87;
            int is = 94;
            int science = 91;
            int total = math + urdu + english + is + science;
            System.out.println("Your Marks is");
            System.out.println(total);
        }

         else if (roll == 6) {


            int math = 94;
            int urdu = 86;
            int english = 95;
            int is = 69;
            int science = 86;
            int total = math + urdu + english + is + science;
            System.out.println("Your Marks is");
            System.out.println(total);
        }

         else {
            System.out.println("Data Not Found");
        }
    }

}