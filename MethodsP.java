package  com.company;
import  java.util.Scanner;
public  class  MethodsP
{

    static  int   no (int ... arr)
    {
        int result = 0;
        for (int ele:arr)
        {
            result+=ele;
        }
        return result;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(no(21,2,3,3,32,342,3));

    }

}