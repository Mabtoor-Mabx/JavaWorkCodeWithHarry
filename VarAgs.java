package  com.company;

public  class  VarAgs{

     int  Arr(int ... arr)  // For Multiple variable Arguments
    {
        int result = 0;
        for (int a: arr)
        {
            result+=a;
        }
        return result;
    }


    public static void main(String[] args)


    {

    VarAgs obj = new VarAgs();
        System.out.println(obj.Arr(12,21,3,23,23,2,3,23,11,2));


    }



}