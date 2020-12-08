package  com.company;

class Ali
{
   public void Ali()
    {
        System.out.println("Ali Is very Good Boy");
    }
}

class Maha extends Ali
{

   public void Ali()
    {
        System.out.println("Maha is A Good Girl");
    }
}

public  class  Method_Overriding
{

    public static void main(String[] args)
    {
     Maha mn = new Maha() ;
     mn.Ali();
    }



}