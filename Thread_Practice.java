package com.company;
// EXTEND CLASS METHOD

/*class MyThread01 extends Thread
{
    public void run()
    {
        int i = 1;
        while (i<=100000)
        {
            System.out.println("Hello Sir! What Can I Help For You!!!");
            i++;
        }
    }
}

class MyThread03 extends  Thread
{
    public void run()
    {
        int i = 1;
        while (i<=100000)
        {
            System.out.println("Thank You For Joining us!Have A Nice Day!!");
        i++;
        }
    }
}

public  class  Thread_Practice
{
    public static void main(String[] args)
    {
        MyThread01 t1 = new MyThread01();
        MyThread03 t3 = new MyThread03();
        t1.start();
        t3.start();

    }

}*/




// By Runnable Interface



class  Mythread01 implements  Runnable
{
    @Override
    public void run() {
        while (true)
        {
            System.out.println("Hello Sir! What Can I Help For You!!!");
        }
    }
}


class Mythread03 implements  Runnable
{
    @Override
    public void run()
    {
        while (true)
        {
            System.out.println("Thanks For Joining US! Have A Good Day!!!");
        }

    }
}


public  class  Thread_Practice
{
    public static void main(String[] args)
    {
        Mythread01 t1 = new Mythread01();
        Mythread03 t3 = new Mythread03();
        Thread te = new Thread(t1);
        Thread tr = new Thread(t3);
        tr.start();
        te.start();

    }

}







