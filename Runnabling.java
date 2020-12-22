package com.company;

class MyThread1 implements  Runnable
{
    public  void run()
    {
        int i=0;
        while(i<300000) {
            System.out.println("I am Thread1 not Threat1");
            i++;
        }
    }
}


class MyThread3 implements  Runnable // THIS IS RUNNABLE METHOD OF THREAD
{
    public  void run() // RUN IS PRE DEFINED FUNCTION IN THREAD
    {
        int i=0;
        while (i<400000)
        {
            System.out.println("I am Thread3 Not Threat3");
            i++;
        }
    }
}


public  class  Runnabling
{
    public static void main(String[] args)
    {
        MyThread1 my = new MyThread1();
        MyThread3 mt = new MyThread3();
        Thread ty = new Thread(my); // IN THIS LINE ! WE CREATE THREAD FOR THIS RUNNABLE CLASS  THIS IS COMPULSORY
        Thread td = new Thread(mt);
        ty.start(); // START IS PREDEFINED FUNCTION IN THREAD
        td.start();

    }

}