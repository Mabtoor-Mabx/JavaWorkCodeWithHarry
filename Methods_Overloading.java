package  com.company;
public  class Methods_Overloading
{

    static  void Mor()
    {
        System.out.println("Hello! Good morning");
    }


    static  int Mor( int x )
    {

        System.out.println("Good Morning Mr :" + x);
        return x;
    }

    static  int Mor(int x , int y)
    {
        System.out.println("Good Morning Mr :" + x + " And" + y);
        return  x & y;
    }






    public static void main(String[] args)
    {

        Mor();
        Mor(32);
        Mor(32,42);
    }
}