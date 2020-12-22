package com.company;

class MyThread extends  Thread  // THIS IS EXTEND THREAD CLASS METHOD
{
    public  void run() // RUN IS PRE DEFINED FUNCTION IN THREAD
    {
        int i=0;
        while (i<40000)
        {
            System.out.println("I am Learning JAVA");
            System.out.println("I am Taking Breakfast");
            i++;
        }
    }

}


class MyThread2 extends  Thread
{
    public  void run()
    {
        int i=0;
        while (i<=40000)
        {
            System.out.println(" I am Learning Data Sutructure And Python");
            System.out.println(" I am Taking Lunch");
            i++;
        }
    }
}



public  class Threading
{
    public static void main(String[] args) {
        MyThread my = new MyThread();
        MyThread2 mt = new MyThread2();
        my.start(); // START IS PREDEFINED FUNCTION IN THREAD
        mt.start();
    }

}
