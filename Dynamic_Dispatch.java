package com.company;

class Phone
{
    public  void Meth()
    {
        System.out.println("I am Method 1 In Phone");
    }
    public  void Meth2()
    {
        System.out.println("I am Method 2 In Phone");
    }
}

class  Smart extends Phone
{
    public  void Meth3()
    {
        System.out.println(" I am Method 1 In SmartPhone ");
    }
    public  void Meth()
    {
        System.out.println("I am Method 2 In SmartPhone");
    }
}


public  class Dynamic_Dispatch
{
    public static void main(String[] args)
    {

        Phone pm = new Smart(); // Dynamic Method Dispatch In Java Program
        pm.Meth();
        pm.Meth2();


    }


}


