package  com.company;


// Problem 1

/*class  Employee
{
    int salary ;
    String name ;

    public   int GetSalary()
    {
        return  salary;
    }
    public  String GetName()
    {
        return  name;
    }
    public  void  SetName(String n)
    {
        name = n;
    }

}


public  class Assignment_8
{
    public static void main(String[] args)
    {

        Employee emp = new Employee();
        emp.SetName("Masti Kar Raya Aye Baaz Aa ja!");
        System.out.println(emp.GetName());

    }
}*/



// Problem 2

/*class  phone
{
    public  void Ring()
    {
        System.out.println("Ringing ...");
    }
    public  void Vibrate()
    {
        System.out.println("Vibrating ...");
    }

    public  void CallFriend()
    {
        System.out.println("We Call A Friend");
    }
}


public  class Assignment_8
{
    public static void main(String[] args)
    {
     phone Pla = new phone();
     Pla.CallFriend();
     Pla.Ring();
     Pla.Vibrate();
    }
}*/



// Problem 3

/*class Square
{
    int area;
    public  int Area (int n)
    {
        area = n*n;
        return area;
    }
    public  int Perimemter(int n)
    {
        area = 4*n;
        return area;
    }
}


public  class Assignment_8
{
    public static void main(String[] args)
    {
     Square sq = new Square();
     int Val = 5;
        System.out.println(sq.Area(Val));
        System.out.println(sq.Perimemter(Val));

    }

}*/



// Problem 4


/*class Rectangle
{
    int area;
    public int Area(int length, int width)
    {
        area= length * width;
        return  area;
    }

    public  int Perimeter(int length, int width)
    {
        area = 2 * length * width ;
        return area;
    }
}

public  class Assignment_8
{
    public  static void main(String[] args)
    {
        Rectangle rc  = new Rectangle();
        int val = 6;
        int len = 3;
        System.out.println(rc.Area(val, len));
        System.out.println(rc.Perimeter(val,len));

    }
}*/



// Problem 5

/*
class Tommy
{
    public  void Hit()
    {
        System.out.println("Hitting...");
    }
    public  void Run()
    {
        System.out.println("Running ...");
    }
    public  void  Fire()
    {
        System.out.println("Firing ...");
    }
}

public  class Assignment_8
{
    public static void main(String[] args)
    {
    Tommy tm = new Tommy();
    tm.Hit();
    tm.Fire();
    tm.Run();

    }
}
*/



// Assignment 6

class Circle
{
    float r;
    public  float Area(float n)
    {
        r = 3.14f * n;
        return r;
    }
    public  float Perimeter(float n)
    {
        r = 2 * 3.14f * n;
        return r;
    }
}

public  class  Assignment_8
{
    public static void main(String[] args)
    {
     Circle ci = new Circle();
     int  radius = 34;
        System.out.println(ci.Area(radius));
        System.out.println(ci.Perimeter(radius));
    }
}


