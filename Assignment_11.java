package com.company;

// Problem 1
/*

abstract  class  Pen
{
    abstract  void Write();
    abstract  void Refill();
}

class  FountainPen extends  Pen
{
    void Write()
    {
        System.out.println("Pen Is For Write Something");
    }
    void Refill()
    {
        System.out.println("When Ink is Down , You Can Refill The Pen");
    }

}

public  class Assignment_11
{
    public static void main(String[] args)
    {
        FountainPen fp = new FountainPen();
        fp.Write();
        fp.Refill();

    }

}*/



// Problem 2

/*

abstract  class  Pen
{
    abstract  void Write();
    abstract  void Refill();
}

class  FountainPen extends  Pen
{
    void Write()
    {
        System.out.println("Pen Is For Write Something");
    }
    void Refill()
    {
        System.out.println("When Ink is Down , You Can Refill The Pen");
    }
    void ChangeNib()
    {
        System.out.println("You Can Change The Nib When Nib is Break");
    }

}

public  class Assignment_11
{
    public static void main(String[] args)
    {
        FountainPen fp = new FountainPen();
        fp.Write();
        fp.Refill();
        fp.ChangeNib();

    }

}
*/



// Problem 3
/*

class  Monkey
{
    public  void Jump()
    {
        System.out.println("Jumping!!!");
    }
    public  void Bite()
    {
        System.out.println("Biteing!!!");
    }
}

interface  BasicAnimal
{
    void Eat();
    void  Sleep();

}

class  human extends  Monkey implements  BasicAnimal
{
    @Override
    public void Eat()
    {
        System.out.println("Eating The Food");
    }

    @Override
    public void Sleep()
    {
        System.out.println("Sleeping in Night");
    }
    public  void Speak()
    {
        System.out.println("Speaking!!!");
    }
}

public  class  Assignment_11
{
    public static void main(String[] args)
    {

        human hu = new human();
        hu.Eat();
        hu.Sleep();
        hu.Speak();
        hu.Bite();
        hu.Jump();

    }

}*/



// Problem 4

/*

abstract class  Telephone
{
    abstract void Ring();
    abstract  void pick();
    abstract  void Disconnect();
}

class  Smartphone extends Telephone
{
    public void Ring()
    {
        System.out.println("Ringing The Phone");
    }

    public  void pick()
    {
        System.out.println("Pick Up The Phone");
    }

   public void Disconnect()
   {
       System.out.println("Disconnect The Phone");
    }

    public  void Capture()
    {
        System.out.println("Capture A Photo");
    }
    public  void  Video()
    {
        System.out.println("Making A Video");
    }
    public  void Music()
    {
        System.out.println("Listening To Music");
    }

}


public class  Assignment_11
{
    public static void main(String[] args)
    {
        Telephone tm = new Smartphone();
        tm.Ring();
        tm.pick();
        tm.Disconnect();
    }

}*/




// Problem 5

/*

class  Monkey
{
    public  void Jump()
    {
        System.out.println("Jumping!!!");
    }
    public  void Bite()
    {
        System.out.println("Biteing!!!");
    }
}

interface  BasicAnimal
{
    void Eat();
    void  Sleep();

}

class  human extends  Monkey implements  BasicAnimal
{
    @Override
    public void Eat()
    {
        System.out.println("Eating The Food");
    }

    @Override
    public void Sleep()
    {
        System.out.println("Sleeping in Night");
    }
    public  void Speak()
    {
        System.out.println("Speaking!!!");
    }
}

public  class  Assignment_11 {
    public static void main(String[] args) {

        Monkey mn = new human();
        mn.Bite();
        mn.Jump();
//        mn.speak();  DOes Not Work Because Ye is Ka Hissa Nahi HAy.

    }
}*/




// Problem 6 & 7


interface  TvRemote
{
    void Poweroff();
    void PowerOn();
}

interface  SmartRemote extends TvRemote
{
    void ChangeChannel();
    void ChannelSet();
}

class TV implements  SmartRemote
{

    public void ChangeChannel()
    {
        System.out.println("Channel Is Changing");

    }

    public void ChannelSet() {
        System.out.println("Setting The Channel");
    }


    public void PowerOn()
    {
        System.out.println("TV is On");
    }


    public void Poweroff() {
        System.out.println("TV is Off");
    }
}



public  class  Assignment_11
{
    public static void main(String[] args)
    {
        TV tv = new TV();
        tv.PowerOn();
        tv.Poweroff();
        tv.ChannelSet();
        tv.ChangeChannel();
    }
}