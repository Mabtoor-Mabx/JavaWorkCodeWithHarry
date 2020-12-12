package com.company;;
import  java.util.Scanner;


// Assignment_11

// Problem 1 & 2

/*
abstract  class  pen
{
    abstract  void write();
    abstract  void Refill();
}

class  Foundationpen extends pen
{
    @Override
   public void write()
    {
        System.out.println("Write With Pen");

    }

    @Override
    public void Refill()
    {
        System.out.println("Refilling The Pen");
    }


    public  void ChangeNib()
    {
        System.out.println("Changing The Nib");
    }

}


public  class  Weekend_Practice
{

    public static void main(String[] args)
    {
        Foundationpen fp = new Foundationpen();
        fp.write();
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
        System.out.println("Jumping...");
    }

    public  void Bite()
    {
        System.out.println("Biting...");
    }
}
interface BasicAnimal
{
    void Eat();
    void Sleep();
}

class Human2 extends Monkey implements BasicAnimal
{
    @Override
    public void Eat() {
        System.out.println("Eating...");
    }

    @Override
    public void Sleep() {
        System.out.println("Sleeping");
    }
}


public  class  Weekend_Practice
{


    public static void main(String[] args)
    {
        Human2 hu = new Human2();
        hu.Eat();
        hu.Sleep();
        hu.Bite();
        hu.Jump();

    }

}*/



// Problem 4

/*
abstract  class  Phone3
{
   abstract void Ring();
    abstract void  Lift();
    abstract void Disconnect();
}


class  Smartphone extends  Phone3
{
    @Override
    void Lift() {
        System.out.println("Lifting The Phone");
    }

    @Override
    void Ring() {
        System.out.println("Ringing The Phone");
    }

    @Override
    void Disconnect() {
        System.out.println("Disconnect The Phone Call");
    }

    public  void Capture()
    {
        System.out.println("Capture The Picture");
    }

    public  void Video() {
        System.out.println("Shoot The Video");
    }
}


public  class Weekend_Practice
{

    public static void main(String[] args)
    {
     Phone3 p = new Smartphone();
     p.Ring();
     p.Lift();
     p.Disconnect();
    }

}

*/



// Problem 5

/*

class  Monkey
{
    public  void Jump()
    {
        System.out.println("Jumping...");
    }

    public  void Bite()
    {
        System.out.println("Biting...");
    }
}
interface BasicAnimal
{
    void Eat();
    void Sleep();
}

class Human2 extends Monkey implements BasicAnimal
{
    @Override
    public void Eat() {
        System.out.println("Eating...");
    }

    @Override
    public void Sleep() {
        System.out.println("Sleeping");
    }
}


public  class  Weekend_Practice
{


    public static void main(String[] args)
    {
        Monkey mn = new Human2();
        mn.Bite();
        mn.Jump();
    }

}*/



// Problem 6 & 7

/*

interface  TvRemote2
{
    void OnTV();
    void OffTV();
}

interface SmartTvRemote2 extends  TvRemote2
{
    void SetChannel();
    void ChangeChannel();
}

class  Tv implements  TvRemote2
{

    @Override
    public void OnTV() {
        System.out.println("On The TV");
    }

    @Override
    public void OffTV() {
        System.out.println("OFF The TV");
    }
}

public class Weekend_Practice
{

    public static void main(String[] args)
    {
     Tv tv = new Tv();
     tv.OnTV();
     tv.OffTV();

    }

}*/



// Assignment_10



// Problem 1




/*

class  Circle3
{
    int radius;
    public  int Area(int r)
    {
        radius =  (int) Math.PI * r * r;
        return  radius;
    }

}

class  Cylinder extends  Circle3
{
    public int Area2(int r)
    {
        radius =  (int) Math.PI * r * r * r;
        return  radius;
    }
}


public  class  Weekend_Practice
{

    public static void main(String[] args)
    {

        Cylinder cy = new Cylinder();
        int Circle = cy.Area(3);
        System.out.println("The Area Of Circle Is " + Circle);
        int Cylinder= cy.Area2(2);
        System.out.println("The Area Of Cylinder Is " + Cylinder);

    }

}*/




// Problem 2

/*

class  Rectangle
{
    int radius;
    public  int Area(int r ,int h)
    {
        radius = (int) Math.PI * r * h;
        return radius;
    }
}

class  Cuboid3 extends  Rectangle
{
    public  int Area(int r , int v , int h)
    {
        radius = (int) Math.PI * r * v * h;
        return  radius;
    }
}


public  class  Weekend_Practice
{
    public static void main(String[] args)
    {
        Cuboid3 cu = new Cuboid3();
        int Rectagle = cu.Area(2, 3);
        int Cuboid = cu.Area(2, 3,4);
        System.out.println("The Area Of Rectangle Is " + Rectagle);
        System.out.println("The Area Of Cuboid Is " + Cuboid);

    }


}*/


// Problem 3
/*


class  circle
{
    int radius;

    public  int Area(int r)
    {
        radius =  (int) Math.PI * r * r;
         return  radius;
    }

    public  int Volume(int r)
    {
        radius = (int) Math.PI * r * r *r;
        return  radius;
    }

}


class   Cylinder extends  circle
{
    public int Area(int r, int v)
    {
        radius = (int) Math.PI * r * v;
        return  radius;
    }

    public  int Volume(int r , int v)
    {
        radius = (int) Math.PI * r * r * v;
        return  radius;
    }
}


public  class  Weekend_Practice
{
    public static void main(String[] args)
    {
        Cylinder cy = new Cylinder();
       int Cir = cy.Area(3);
       int  Cir2 = cy.Volume(3);
       int  Cyl = cy.Area(2,2);
       int  Cyl1 = cy.Volume(3,2);
        System.out.println("The Area Of Circle Is " + Cir);
        System.out.println("The Volume Of Circle Is " + Cir2);
        System.out.println("The Area Of Cylinder Is " + Cyl);
        System.out.println("The Volume Of Cylinder Is " + Cyl1);
    }

}*/


// Problem 4

/*

class Rectangle2
{
    int radius;

    public int getRadius(int r) {
        System.out.println("The Area Of Rectangle is" + Math.PI * r * r);
        System.out.println("The Volume Of Rectangle is" + Math.PI* r* r * r);
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}

class  Cuboid4  extends  Rectangle2
{
    public  void Area2(int  r)
    {
        System.out.println("The Area Of Cuboid is" + r);
    }

    public  void Volume2(int  r)
    {
        System.out.println("The Volume Of Cuboid is" + r);
    }
}


public  class  Weekend_Practice
{
    public static void main(String[] args)
    {

        Cuboid4 vy = new Cuboid4();
        vy.setRadius(4);
        vy.getRadius(4);

    }

}

*/




// Assignment _9


//Problem 1
/*

class Cylinder
{
    int radius;
    int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public  class  Weekend_Practice
{
    public static void main(String[] args)
    {
     Cylinder cy = new Cylinder();
     cy.setRadius(2);
     cy.setHeight(3);
        System.out.println("The Radius Of Cylinder is " + cy.getRadius());
        System.out.println("The Height Of Cylinder Is " + cy.getHeight());
    }

}
*/



// Problem 2
/*

class  Cylinder
{
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

public  class  Weekend_Practice
{

    public static void main(String[] args)
    {
        Cylinder cy = new Cylinder();
        cy.setRadius(2);
        System.out.println("The Area Of Cylinder Is " + Math.PI * cy.getRadius() * cy.getRadius() );
        System.out.println("The Volume Of Cylinder Is " + Math.PI * cy.getRadius() * cy.getRadius() * cy.getRadius());


    }

}*/



// Problem 3

/*

class  Cylinder
{
    int radius;

    public Cylinder(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}

public  class  Weekend_Practice
{


    public static void main(String[] args)
    {

        Cylinder cy = new Cylinder(3);
        System.out.println(" The Surface Area OF Cylinder Is  " + Math.PI * cy.getRadius() * cy.getRadius());
        System.out.println("The Volume Of Cylinder Is " + Math.PI * cy.getRadius() * cy.getRadius() * cy.getRadius());

    }


}*/



// Problem 4

/*

class Rectangle
{
    int length;
    int breath;

    public Rectangle() {
        this.length = 4;
        this.breath = 5;
    }


    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }


    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }
}





public  class  Weekend_Practice
{

    public static void main(String[] args)
    {
        Rectangle rc = new Rectangle();
     Rectangle re = new Rectangle(2, 3);
        System.out.println(rc.getLength());
        System.out.println(rc.getBreath());
        System.out.println(re.getLength());
        System.out.println(re.getBreath());

    }

}
*/




// Problem 5
/*

class  Sphere3
{
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

public  class  Weekend_Practice {
    public static void main(String[] args) {


        Sphere3 e = new Sphere3();
        e.setRadius(3);
        System.out.println("The Radius Of Sphere Is  " + e.getRadius());

    }
}*/



// Assignment_8


// Problem 1
/*

class  Employee
{
    int Salary;
    String name;
    public  int getSalary( int Salary)
    {
        this.Salary = Salary;
        return  Salary;
    }
    public  String Getname()
    {
        return  name;
    }
    public  void ChangeName(String name)
    {
        this.name= name;
    }
}

public  class Weekend_Practice
{

    public static void main(String[] args)
    {
     Employee em = new Employee();
     em.ChangeName("My Name Is Mabtoor Ul Shafiq");
     em.Getname();

    }

}
*/



// Problem 2

/*

class Cellphone
{
    public  void Ring()
    {
        System.out.println("Ringing!!!");
    }
    public  void Vib()
    {
        System.out.println("Vibrating!!!");
    }
}

public  class  Weekend_Practice
{
    public static void main(String[] args)
    {

        Cellphone cy = new Cellphone();
        cy.Ring();
        cy.Vib();

    }

}*/



// Problem 3
/*

class Square
{
    int radius;
    public  int Area(int radius)
    {
        radius = (int) Math.PI * radius * radius;
        return  radius;
    }
    public  int Perimeter(int radius)
    {
        radius = (int) ( 2 * Math.PI * radius);
        return  radius;
    }
}


public  class  Weekend_Practice
{

    public static void main(String[] args)
    {

        Square sq = new Square();
        System.out.println("The Area Of Square Is " + sq.Area(3));
        System.out.println("The Perimeter Of Square Is " + sq.Perimeter(3));
    }

}*/



// Problem 4
/*

class  Rectangle
{
    int radius;
    public  int Area(int radius)
    {
        radius = (int) (2 * Math.PI * radius);
        return  radius;
    }
    public  int Perimeter(int radius)
    {
        radius = (int) (3 * Math.PI * radius);
        return  radius;
    }
}

public  class  Weekend_Practice
{
    public static void main(String[] args)
    {
        Rectangle re = new Rectangle();
        System.out.println("The Area Of Traingle Is " + re.Area(3));
        System.out.println("The Perimeter Of Triangle Is" + re.Perimeter(3));

    }

}*/

// Problem 5
/*
class  Tommy3
{
    public  void Hit()
    {
        System.out.println("Hitting!!!");
    }
    public  void Run()
    {
        System.out.println("Running!!!");
    }

    public  void Fire()
    {
        System.out.println("Firing!!!");
    }
}

public  class  Weekend_Practice
{
    public static void main(String[] args)
    {
        Tommy3 t3 = new Tommy3();
        t3.Fire();
        t3.Hit();
        t3.Run();

    }

}*/



// Problem 6
/*

class Circle2
{
    int radius;
    public  int Area(int radius)
    {
        radius =  (int) (2 * Math.PI * radius);
        return  radius;
    }
    public  int Perimeter(int radius , int height)
    {
        radius = (int) (2 * Math.PI * radius * height);
        return  radius;
    }

}

public  class Weekend_Practice
{
    public static void main(String[] args)
    {

        Circle2 cr = new Circle2();
        System.out.println("The Area Of Circle is " + cr.Area(4));
        System.out.println("The Perimeter Of Circle is " + cr.Perimeter(3,4));

    }

}*/



// Assignment_7


// Problem 1

/*

public  class Weekend_Practice
{
    static  void table(int n)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println( n  + " X " + i + " = " + n*i);
        }
    }
    public static void main(String[] args)
    {
      table(3);
    }

}*/



// Problem 2
/*

public  class  Weekend_Practice
{

    static void Star(int n)
    {
        for (int i=0 ; i<=n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        Star(3);
    }

}*/


// Problem 3

/*

public class  Weekend_Practice
{
    static  int res(int n)
    {
        if (n==0)
        {
            return  0;
        }
        else
        {
            return  n + res(n-1);
        }

    }

    public static void main(String[] args)
    {
        System.out.println( "The Sum Of These Number is "  + res(4));

    }

}
*/


// Problem 4

/*

public class  Weekend_Practice
{
    static  void Star2(int n)
    {
        for (int i=n;i>=0;i--)
        {
            for (int j=0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args)
    {

        Star2(4);

    }
}*/



// Problem 5
/*

public  class  Weekend_Practice
{
    static  int Res2(int n)
    {
        if (n==1||n==2)
        {
            return  n-1;
        }
        else
        {
            return   Res2(n-1) + Res2(n-2);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("The Fibbonacci Number is " + Res2(3));

    }


}*/



// Problem 6
/*

public  class  Weekend_Practice
{

    static  int num(int n)
    {
        int sum=0;
        for (int i=0;i<=n;i++)
        {
            sum = sum + i;
        }
        return  sum;
    }

    public static void main(String[] args)
    {
        System.out.println("The Sum Of These Number Is " + num(4));
    }


}*/



// Problem 9
/*


public  class  Weekend_Practice
{

    static  float faren(float cels)
    {
       float faren = (cels *(5/9)+32);
       return faren;
    }

    public static void main(String[] args)
    {
        float c = faren(3);
        System.out.println("The Temperature In Farenheight is " + c);
    }


}*/




// Problem 10

/*

public  class  Weekend_Practice
{

    static  int  Sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
    return  sum;
    }

    public static void main(String[] args)
    {

        System.out.println(Sum(4));


    }


}

*/



// Assignment_6

// Problem 1
/*
public  class  Weekend_Practice
{
    public static void main(String[] args)
    {

        float [] arr= {12.4f,3.2f,32.5f,65.6f,657.4f};
        float sum =0;
        for (float ele:arr)
        {
            sum = sum + ele;
        }

        System.out.println(sum);

    }

}*/



// Problem 2
/*

public  class  Weekend_Practice
{

    public static void main(String[] args)
    {

        int []  arr = {21,4,23,44,355,546,5443,342332,23243434};
        int no = 4;
        for (int ele: arr)
        {
            if (no==ele)
            {
                no= ele;

            }
        }
        if (true)
        {
            System.out.println("Number Is Present In Array");
        }

        else
        {
            System.out.println("Number Is Not Present In Array");
        }

    }

}*/



// Problem 3

/*


public  class  Weekend_Practice
{
    public static void main(String[] args)
    {
        int []  arr = {21,32,32,13,2,3424,3,32,32,3,23,12,1};
        int sum = 0;
        for (int ele: arr)
        {
            sum = sum + ele;
        }

        System.out.println("The Average Of Number Is " + sum/ arr.length);
    }


}*/



// Problem 4

/*
public  class  Weekend_Practice
{
    public static void main(String[] args)
{

    int [] [] arr1 =   {{0,0,0},{0,1,1} };
    int [] [] arr2=    {{0,1,0},{1,1,0}};
    int [] [] res =    {{0,0,0},{0,0,0}};

  for (int i=0;i< arr1.length;i++)
  {
      for (int j=0;j< arr1[i].length;j++)
      {
          res[i][j]= arr1[i][j] + arr2[i][j];
          System.out.print(res[i][j]);

      }
      System.out.println("");
  }

}
}*/



// Problem 5

/*
public  class Weekend_Practice
{
    public static void main(String[] args)
    {
     int [] arr = {10,20,30,40,50,60};
     int l = arr.length;
     int no =Math.floorDiv(l,2);

     for (int i=0;i<no;i++)
     {
        int temp = arr[i];
        arr[i]= arr[l-i-1];
        arr[l-i-1] = temp;
     }

     for (int ele: arr)
     {
         System.out.println(ele);
     }
    }
}
*/

// Problem 5

/*
public  class  Weekend_Practice
{
    public static void main(String[] args)
    {
        int [] arr = {10,20,30,40,50,60,70};
        int l = arr.length;
        int no = Math.floorDiv(l,2);
        for (int i=0;i<=no;i++)
        {
            int temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }

        for (int ele : arr)
        {
            System.out.println(ele);
        }
    }

}*/



// Problem 6
/*

public  class  Weekend_Practice
{
    public static void main(String[] args) {
        int[] arr = {21, 21, 32, 23, 334, 334, 23, 13, 2, 432, 3423};
        int no = Integer.MIN_VALUE;
        for (int ele : arr)
        {
            if (no<ele)
            {
                no = ele;
            }
        }

        System.out.println("The Maximum Number Is " + no);

    }

}*/




// Problem 7
/*

public  class  Weekend_Practice
{
    public static void main(String[] args)
    {
     int []  arr = {2,12,132,32,32,234,34,2,31,21,3,23,23,2};
     int no = Integer.MAX_VALUE;
     for (int ele : arr)
     {
         if (no>ele)
         {
             no = ele;
         }
     }
        System.out.println("The Minimum Number Of Array is " + no);
    }

}*/



// Problem 8

/*

public  class Weekend_Practice
{
    public static void main(String[] args)
    {

        int [] arr = {2,21,32,32,43,34,2,31,342,4,34,2,3};
        boolean Issorted = true;
        for (int i=0;i< arr.length-1;i++)
        {
            if (arr[i] > arr[i+1])
            {
                Issorted = false;
            }
        }

        if (Issorted)
        {
            System.out.println("Array Is Sorted!!!!");
        }
        else
        {
            System.out.println("Array Is Not Sorted!!!");
        }

    }

}*/



// Assignment_5

// Problem 1

/*
public  class  Weekend_Practice
{

    public static void main(String[] args)
    {

        int no =4;
        for (int i=no;i>0;i--)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
   */

// Problem 2
/*
public class  Weekend_Practice
{

    public static void main(String[] args)
    {
        int no = 4;
        int sum =0;
        int i =0;
        while (i<no)
        {
            sum = sum + 2*i;
            i++;
        }
        System.out.println(sum);
    }


}*/



// Problem 3
/*
public  class  Weekend_Practice
{

    public static void main(String[] args)
    {

        int no = 4;
        for (int i =1; i<=10;i++)
        {
            System.out.println(no + "X " + i + " = " + no*i);
        }
    }
}*/


// Problem 4

/*
public  class  Weekend_Practice
{

    public static void main(String[] args)
    {
        int no = 10;
        for (int i =no; i>0;i--)
        {
            System.out.println(no + " X " + i + " = " + no*i);
        }
    }

}*/


// Problem 5

/*

public  class  Weekend_Practice
{

    public static void main(String[] args)
    {
     int no =3;
     int Fact= 1;
     for (int i = 1; i<=no;i++)
     {
        Fact*=i;
     }
        System.out.println(Fact);

}

}*/




// Problem  6
/*

public  class  Weekend_Practice
{
    public static void main(String[] args)
    {
     int no = 4;
     int fact = 1;
     int i = 1;
     while (i<=no)
     {
         fact*=i;
         i++;
     }

        System.out.println(fact);
    }

}*/



// Problem 9
/*

public  class  Weekend_Practice
{
    public static void main(String[] args)
    {
     int no = 8;
     int sum =1;
     for (int i=1;i<=10;i++)
     {
          sum = sum + (no*i);
     }
        System.out.println(sum);
    }


}

*/



// Assignment_4


// Problem 1

/*
public  class  Weekend_Practice
{


    public static void main(String[] args)
    {
        int no = 11;
        if (no==10)
        {
            System.out.println("I am Not 11");
        }
        else
        {
            System.out.println("I am 11");
        }

    }

}*/

// Problem 2

/*

public  class  Weekend_Practice
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter Third Number");
        int num3 = sc.nextInt();
        int total = num1 + num2 + num3;
        if (num1<= 33 || num2 <= 33 || num3 <= 33)
        {
            System.out.println("You Are FaiL! Because Your Marks Are Less Than 33");
        }
        else  if (total/3<40)
        {
            System.out.println("You Are Fail Because Your Marks Are Less Than 40 %");
        }
        else
        {
            System.out.println("You Are Pass!!!");
        }



    }

}*/



// Problem 3
/*

public  class  Weekend_Practice
{


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income");
        int income = sc.nextInt();
        float tax = 0;
        if (income>2500000 && income<=5000000)
        {
            tax =   tax + 0.05f *(income-2500000);
        }
        else  if (income>5000000 && income<=7500000)
        {
            tax = tax + 0.20f*(income-5000000);
        }
        else if (income>10000000)
        {
            tax = tax + 0.30f* (income-10000000);
        }

        System.out.println(tax);
    }

}*/




// Problem 4

public  class  Weekend_Practice
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Week Number");
        int no = sc.nextInt();
        if (no ==1)
        {
            System.out.println("Today Is Monday");
        }
        else if (no ==2)
        {
            System.out.println("Today Is Tuesday");
        }
        else if (no ==3)
        {
            System.out.println("Today Is Wednesday");
        }
        else if (no ==4)
        {
            System.out.println("Today Is Thursday");
        }
        else if (no ==5)
        {
            System.out.println("Today Is Friday");
        }
        else if (no ==6)
        {
            System.out.println("Today Is Sunday");
        }
        else
        {
            System.out.println("Today Is Sunday");
        }

    }

}



// Problem 5
/*

public  class  Weekend_Practice
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int no = sc.nextInt();
        if (no%4==0)
        {
            System.out.println("This Is Leap Year");
        }
        else
        {
            System.out.println("This Is Not A Leap Year");
        }

    }

}
*/


// Problem 6

/*

public  class  Weekend_Practice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Website Extension");
        String ex = sc.next();
        if (ex.equals(".com"))
        {
            System.out.println("It Is Commercial Website");
        }
        else if (ex.equals(".org"))
        {
            System.out.println("It Is Organizational Website");
        }
        else if (ex.equals(".edu"))
        {
            System.out.println("It Is Educational Website");
        }

    }

}*/



// Assignment_3
/*
public  class  Weekend_Practice
{
    public static void main(String[] args)
    {

        //   Problem 1
*//*
        String str = "MY NAME IS MABTOOR UL SHAFIQ";
        str = str.toLowerCase();
        System.out.println(str);

 *//*

//        Problem 2
     *//*   String str = "My Name Is Mabtoor Ul Shafiq";
        str = str.replace(" ", "_");
        System.out.println(str);
*//*

//         Problem 3

        *//*
        String letter = "Dear <|NAME|> Thanks A Lot!";
        letter = letter.replace("<|NAME|>", "Mabx");
        System.out.println(letter);
        *//*

//         Problem 4
        *//*String letter = "This Is  Mabtoor Mabx ";
        letter = letter.trim();
        System.out.println(letter);*//*

// Problem 5
        *//*String letter = "Dear Harry! \n This Python Course Is Nice! \n Thanks!";
        System.out.println(letter);*//*



    }

}*/




// Assignment_2

/*
public  class  Weekend_Practice
{

    public static void main(String[] args)
    {

//        Problem_1
        *//*float a = 7/4*9/2;
        System.out.println(a);*//*


//        Problem_2
        *//*String grade = "A";
        grade = grade + "8";
        System.out.println(grade);*//*

//        Problem_3
        *//*
        int GivenNumber = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number!!!");
        int No = sc.nextInt();
        if (No>=GivenNumber)
        {
            System.out.println("Your Number Is Greatest!!!");
        }
        else
        {
            System.out.println("User Number Is Greatest!!!");
        }
        *//*

//         Problem_4
       *//*
        float v = 9;
        float u = 3;
        float s = 4;
        float a = 6;
        float no = (v*v) - (u*u) / 2 * a * s;
        System.out.println(no);
        *//*

//         Problem_5

       *//* float a = 7 + 49/7 + 35/7;
        System.out.println(a);*//*


    }


}*/




// Assignment_1

/*

public  class  Weekend_Practice
{
    public static void main(String[] args)
    {

        */
/*
        Problem_1
        int no = 1;
        int no2 = 2;
        int no3 = 3;
        int total = no + no2 + no3;
        System.out.println(total);
        *//*


//        Problem 2

*/
/*        int no = 1;
        int no2 = 2;
        int no3 = 3;
        int total = (no + no2 + no3)/3;
        System.out.println(total);
        *//*


//        Problem 3
*/
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " Have A Good Day!");*//*


//        Problem 4

        */
/*
        System.out.println("Enter Value In Kilometer");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println("The value In Mile Is " + no/1000);

  *//*





    }

}
*/





































