package  com.company;

abstract  class  base
{
    public  void Hello()
    {
        System.out.println("Hello ! How Are You");
    }
    abstract  public  void  greet();
}

class  Child extends  base
{
    public  void  greet()
    {
        System.out.println("Greeting Mr! Have A Good Day");
    }
}

public  class  Abstract
{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.greet();

    }



}