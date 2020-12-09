package com.company;


interface  Bike
{
    void  Speed();
    void Brake();
    void Gear();
}
interface  Car
{
    void BackSpeed();
    void MultiGear();
    void BreakingPoint();
}

class  Drive implements  Bike , Car
{
    public  void Speed()
    {
        System.out.println("Speed In Motorcycle");
    }
    public  void Gear()
    {
        System.out.println("Gear In  Motorcycle");
    }
    public  void  Brake()
    {
        System.out.println("Brake In MotorCycle");
    }

    public  void BreakingPoint()
    {
        System.out.println("Brake In Car");
    }

    public  void MultiGear()
    {
        System.out.println("Gears In Car");
    }
    public  void BackSpeed()
    {
        System.out.println("Speed In Car");
    }
}


public  class  Interface
{

    public static void main(String[] args)
    {
        Drive dy = new Drive();
        dy.Speed();
        dy.MultiGear();
        dy.Brake();
        dy.BackSpeed();
        dy.BreakingPoint();
        dy.Gear();

    }

}