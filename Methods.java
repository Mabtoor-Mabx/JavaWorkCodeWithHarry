package  com.company;
import  java.util.Scanner;
public  class  Methods
{
    static int Add( int x , int y)
    {
        int z;
        z = x+y;
        return z;
    }

    static int sub ( int x , int y)
    {
        int z;
        z = x-y;
        return  z;
    }
    static int mult( int x , int y)
    {
        int z;
        z = x*y;
        return  z;
    }
    static int div(int x , int y)
    {
        int z;
        z = x/y;
        return z;
    }
    static int modl(int x,int y)
    {
        int z;
        z= x%y;
        return  z;
    }

    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Value");
        int a = sc.nextInt();
        System.out.println("Enter Second Value");
        int b = sc.nextInt();
        System.out.println("Enter Operator");
        String op = sc.next();

        if( op.equals("+"))
        {
            System.out.println( "The Answer is  :" +  Add(a,b));
        }
        else if(op.equals("-"))
        {
            System.out.println("The Answer is : " +  sub(a,b));
        }
        else if(op.equals("*"))
    {
        System.out.println("The Answer is : " + mult(a,b));
    }
        else  if(op.equals("/"))
    {
        System.out.println("The Answer is :" + div(a,b));
    }
        else  if (op.equals("%"))
        {
            System.out.println("The Answer is :" + modl(a,b));
        }
    }
}
