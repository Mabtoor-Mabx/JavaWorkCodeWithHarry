
package com.company;
import  java.util.Scanner;

/*
 class Add
{
     static  int  Addd(int x , int y )
     {
         int z ;
         z = x+y;
         return z;
     }

}


public  class Oops
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        Add  ad = new Add();
        System.out.println("Enter First Number ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number ");
        int b = sc.nextInt();
        int c = ad.Addd(a,b);
        System.out.println(c);
    }

}*/


class  Calc
{
    static  int Add(int x, int y)
    {
        int z = x+y;
        return  z;
    }

    static  int Sub(int x , int y)
    {
        int z = x-y;
        return  z;
    }

    static  int Mult(int x , int y)
    {
        int z = x*y;
        return  z;

    }
    static  int Div(int x , int y)
    {
        int z = x/y;
        return  z;
    }
}



public  class Oops
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     Calc  cal = new Calc();
     System.out.println("Enter  First Number ");
     int a = sc.nextInt();
     System.out.println("Enter Second Number ");
     int b= sc.nextInt();
     System.out.println("Enter Operator  (' +  , - , * , /')");
     String c = sc.next();

     if (c.equals("+"))
     {
         System.out.println(cal.Add(a,b));
     }
     else if (c.equals("-"))
     {
         System.out.println(cal.Sub(a,b));
     }
     else if (c.equals("*"))
     {
         System.out.println(cal.Mult(a,b));
     }

     else if (c.equals("/"))
     {
         System.out.println(cal.Div(a,b));
     }
    }
}
