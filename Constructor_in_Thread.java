package  com.company;

class  Mythr extends  Thread
{
    public  Mythr(String name)
    {
        super(name);
    }

    public void run()
    {
        System.out.println("I am Good ! Thank You!");
    }
}

public  class  Constructor_in_Thread
{
    public static void main(String[] args) {

        Mythr th = new Mythr("Mabx");
        th.start();
        System.out.println(th.getName());
        System.out.println(th.getId());
    }
}

