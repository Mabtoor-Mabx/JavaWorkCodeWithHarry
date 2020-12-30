package com.company;
// Problem 1

/*
class  Good extends  Thread
{
    @Override
    public void run() {
        while(true)
        {
            System.out.println("Good Morning");
        }
    }
}


class Welcome extends  Thread
{
    @Override
    public void run() {
        while (true)
        {
            System.out.println("Welcome");
        }
    }
}


public  class  Assignment_13
{
    public static void main(String[] args)
    {
        Good g1 = new Good();
        Welcome w1 = new Welcome();
        g1.start();
        w1.start();

    }

}*/



// Problem 2
/*

class  Good extends  Thread
{
    @Override
    public void run() {
        while(true)
        {
            System.out.println("Good Morning");
        }
    }
}


class Welcome extends  Thread
{
    @Override
    public void run() {

        while (true)
        {
            try {
                Thread.sleep(20000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }

            System.out.println("Welcome");
        }
    }
}


public  class  Assignment_13
{
    public static void main(String[] args)
    {
        Good g1 = new Good();
        Welcome w1 = new Welcome();
        g1.start();
        w1.start();

    }

}*/



// Problem 3 4 and 5



class  Good extends  Thread
{
    @Override
    public void run() {
        System.out.println("Good Morning");

    }
}


class Welcome extends  Thread
{
    @Override
    public void run() {
        System.out.println("Welcome");

    }
}


public  class  Assignment_13
{
    public static void main(String[] args)
    {
        Good g1 = new Good();
        Welcome w1 = new Welcome();
        g1.setPriority(4);
        w1.setPriority(7);
        System.out.println(g1.getPriority());
        System.out.println(w1.getPriority());
        System.out.println(g1.getState());
        System.out.println(Thread.currentThread().getState());

    }

}

