package com.company;

class Mythr12 extends  Thread
{
    @Override
    public void run() {
        int i =0;
        while (i<1000) {
            System.out.println("Hello Sir! Whats Up!!!");
            i++;
        }
    }
}


class  Mythr123 extends  Thread
{
    @Override
    public void run() {
        int i=0;
        while (i<200) {
            System.out.println("I am Fine");
            i++;
        }
    }
}


public  class  Methods_in_Threads
{

    public static void main(String[] args) {

        Mythr12 tr = new Mythr12();
        Mythr123  te = new Mythr123();
        tr.start();
        try {
            tr.join();    // Join Is used So that We can Complete First Method Then Used Another One~!
        }                           // Try and Catch is Used To Initialize The Join Element
       catch (Exception e)
       {
           System.out.println(e);
       }


        te.start();

    }

}