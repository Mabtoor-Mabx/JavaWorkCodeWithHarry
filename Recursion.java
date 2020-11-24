package  com.company;

public  class  Recursion
{

    static  int fac(int n)
    {
        if (n==0 || n== 1)
        {
            return  1;
        }
        else
            {
                return  n * fac(n-1);
            }
    }


    public static void main(String[] args)
    {
    int no = 4;

        System.out.println(fac(no));
    }



}