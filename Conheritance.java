package  com.company;
class Base
{
    Base()
    {
        System.out.println("I am Base Constructor with 0 Arguments ");
    }
    Base(int x)
    {
        System.out.println("I am Base Constructor With 1 Value : " + x);
    }

}

class  Derived extends  Base
{
    Derived()
    {
        System.out.println(" I am Derived Constructor With 0 Arguments ");
    }
    Derived(int x, int y)
    {
        super(x);
        System.out.println("I am Derived Constructor With 2 Values :" + x + y);
    }
}


class  ChildDerived extends Derived
{
    ChildDerived()
    {
        System.out.println("I am Child Derived Constructor With 0 Arguments");
    }
    ChildDerived(int x, int y ,int z)
    {
        super(x,y);
        System.out.println(" I am Child Constructor With 3 Values " + x + y + z);
    }
}



public class  Conheritance
{
    public static void main(String[] args)
    {
//        Base b = new Base();
//        Derived d = new Derived();
        ChildDerived c = new ChildDerived(2, 2, 2 );

    }
}

