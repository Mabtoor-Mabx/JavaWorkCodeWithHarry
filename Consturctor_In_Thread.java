package com.company;

class MyThread02 extends Thread // THIS IS EXTEND THREAD CLASS METHOD
{
    public  MyThread02(String name)
    {
        System.out.println("My Name is " + name);;

    }

    public  void run() // RUN IS PRE DEFINED FUNCTION IN THREAD
    {

            System.out.println(" My Name is Mabtoor");

    }

}


public  class  Consturctor_In_Thread
{
    public static void main(String[] args)
    {
     MyThread02 my= new MyThread02("Mabx");
     my.start(); // START IS PRE DEFINED FUNCTION IN THREAD
        System.out.println(my.getId()); // GETID USED TO GET ID IN THREAD

    }
}