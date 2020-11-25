package  com.company;

// Problem 1


//public  class  Assignment_7Again
//{
//    static  int Table(int no)
//    {
//        for (int i = 1; i<=10 ; i++)
//        {
//            System.out.println( no +" X " + i  + " = " + no*i);
//        }
//        return 0;
//    }

//    public static void main(String[] args)
//    {
//     Table(8);
//    }



// Problem 4

//public  class  Assignment_7Again
//{
//static  void  Star(int n)
//{
//    for (int i =n; i>=0;i--)
//    {
//        for (int j=0; j<=i;j++)
//        {
//            System.out.print("*");
//        }
//        System.out.println();
//    }
//
//}
//
//    public static void main(String[] args)
//    {
//     Star(5);
//    }
//
//}


// Problem 2


//public class  Assignment_7Again
//{
//    static  void  StarF(int n)
//    {
//        for (int i=0;i<=n;i++)
//        {
//            for (int j=0;j<=i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args)
//    {
//     StarF(4);
//    }
//
//}


// Problem 3

/*
public class Assignment_7Again
{
    static  int Res(int n)
    {
        if (n==0)
        {
            return 0;
        }
        else {
            return n+ Res(n-1);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(Res(3));
    }

}*/


// Problem 5

public  class  Assignment_7Again
{
    static  int Fib(int n)
    {
        if (n==1||n==2)
        {
            return n-1;
        }
        else
            {
            return Fib(n-1) + Fib(n-2);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(Fib(10));
    }
}







