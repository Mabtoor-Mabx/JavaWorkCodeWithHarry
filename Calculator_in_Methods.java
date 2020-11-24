package  com.company;
import  java.util.Scanner;
public  class  Calculator_in_Methods
{

  static  int Add(int x, int y)
  {
      int z;
      z= x+y;
      System.out.println("The Addition Of Two Values Is : " + z);
      return z;
  }

  static  int Sub(int x, int y)
  {
      int z;
      z = x-y;
      System.out.println("The Subtraction Of Two Values Is : " + z );
      return z;
  }
  static  int Mult(int x, int y)
  {
      int z;
      z = x*y;
      System.out.println("The Multiplications Of Two values Is : " + z );
      return  z;
  }

  static  int Div(int x, int y)
  {
      int z;
      z= x+y;
      System.out.println("The Division Of Two Values Is : " + z);
      return z;
  }


    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter First Value ");
      int a = sc.nextInt();
        System.out.println("Enter Second Value ");
       int b = sc.nextInt();
        System.out.println("Enter Operator ");
        String c = sc.next();

        if (c.equals("+"))
        {
            Add(a,b);
        }
        else  if (c.equals("-"))
        {
            Sub(a,b);
        }

        else  if (c.equals("*"))
        {
            Mult(a,b);
        }

        else  if(c.equals("/"))
        {
            Div(a,b);
        }





    }




}