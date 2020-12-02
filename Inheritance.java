package com.company;

class Animal
{
        public  void Animal()
        {
            System.out.println("This Is Animals List \n");
        }
}

class  Dog extends Animal
{
    public  void Dog()
    {
        System.out.println("I am Dog And I am Bark \n");
    }
}
class Cat extends  Animal
{
    public  void Cat()
    {
        System.out.println("I am Cat And I Say Meyaun \n ");
    }
}


public  class  Inheritance
{

    public static void main(String[] args)
    {

        Dog d = new Dog();
        d.Animal();d.Dog();
        Cat c = new Cat();
        c.Animal();
        c.Cat();

    }



}

