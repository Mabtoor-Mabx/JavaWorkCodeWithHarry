package com.company;

class Mythr01 extends  Thread
{
    public  Mythr01(String name)
    {
        super(name);
    }

    public void run() {
        System.out.println("I am Good " + getName());
    }
}
class Mythr02 extends  Thread
{
    public  Mythr02(String name)
    {
        super(name);
    }

    public void run() {
        System.out.println("I am Good " + getName());
    }
}
class Mythr03 extends  Thread
{
    public  Mythr03(String name)
    {
        super(name);
    }

    public void run() {
        System.out.println("I am Good " + getName());
    }
}
class Mythr04 extends  Thread
{
    public  Mythr04(String name)
    {
        super(name);
    }

    public void run() {
        System.out.println("I am Good " + getName());
    }
}



public  class  Priorities_in_thread
{
    public static void main(String[] args)
    {
        Mythr01 my1 = new Mythr01("Waheed");
        Mythr02 my2 = new Mythr02("Mabx Least Important!!!");
        Mythr03 my3 = new Mythr03("Waqas Most Important!!");
        Mythr04 my4 = new Mythr04("Horair");
        my3.setPriority(Thread.MAX_PRIORITY);
        my2.setPriority(Thread.MIN_PRIORITY);
        my1.start();
        my2.start();
        my3.start();
        my4.start();


    }

}
