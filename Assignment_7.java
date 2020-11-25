package  com.company;

// Problem 1


//public class  Assignment_7
//{
//    static  int Table(int n)
//    {
//        for (int i = 0; i<=10; i++)
//        {
//            System.out.println(n + " X " + i + " = " + n*i);
//        }
//        return 0;
//    }
//
//    public static void main(String[] args)
//    {
//     Table(5);
//    }



// Problem 2



public  class  Assignment_7
{
    static  void  Star(int n)
    {
        for (int i = 0; i<n;i++)
        {
            for (int j=0; j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
     Star(4);
    }


}



// Problem 3

//public  class Assignment_7
//{
//    static  int Res(int n)
//    {
//        if (n==1)
//        {
//            return 1;
//        }
//        else
//        {
//            return n +  Res(n-1);
//        }
//    }
//
//
//    public static void main(String[] args)
//    {
//     int c =Res( 4);
//        System.out.println(c);
//    }
//}



// Problem 4


/*
public  class Assignment_7
{
    static  void Star2(int n)
    {
        for (int i=n;i>=0;i--)
        {
            for ( int j=0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args)
    {
       Star2(5);
    }
}*/



// Problem 5

//public  class  Assignment_7
//{
//    static  int Fib(int n) {
//        if (n == 1 || n == 2) {
//            return n - 1;
//        } else {
//            return Fib(n - 1) + Fib(n - 2);
//        }
//
//    }
//
//
//    public static void main(String[] args)
//    {
//
//        int c = Fib(7);
//        System.out.println(c);
//    }
//
// }


// Problem 6

//public  class  Assignment_7
//{
//
//    static  void Res2(int n)
//    {
//        if (n>0)
//        {
//            Res2(n-1);
//        }
//        for (int i =n; i>0;i--)
//        {
//            System.out.print("*");
//        }
//        System.out.println();
//    }
//
//
//    public static void main(String[] args)
//    {
//     Res2(5);
//    }
//}




// Problem 7
//
//public  class Assignment_7
//{
//    static  int Sum(int n)
//    {
//        int sum = 0;
//        for (int i = 1; i<n; i++)
//        {
//            sum = sum + i;
//        }
//        return sum;
//    }
//
//
//    public static void main(String[] args)
//    {
//     int a = 2;
//     int c = Sum(a);
//        System.out.println(c);
//    }
//}






