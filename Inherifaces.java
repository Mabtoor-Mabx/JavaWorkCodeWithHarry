package  com.company;
// Inheritance In Interfaces


interface Father
{
    void Name();
    void Cnic();
}
interface Boy1 extends  Father
{
    void Boy1Name();
    void Boy1Cnic();
}
interface  Boy2 extends Father {
    void Boy2Name();

    void Boy2Cnic();
}


class  B_Form implements  Boy1,Boy2
{
    public  void Name()
    {
        System.out.println("Muhammad Shafiq");
    }
    public  void Cnic()
    {
        System.out.println("33100-8567309-3");
    }
    public void Boy1Name()
    {
        System.out.println("Mabtoor Ul Shafiq");
    }
    public  void Boy1Cnic()
    {
        System.out.println("33100-2868323-1");
    }

    public  void  Boy2Name()
    {
        System.out.println("Muneeb Ramish");
    }
    public  void Boy2Cnic()
    {
        System.out.println("33100-8534986-2");
    }
}


public  class Inherifaces
{
    public static void main(String[] args)
    {

        B_Form b = new B_Form();
        b.Boy1Name();
        b.Boy1Cnic();
        b.Boy2Name();
        b.Boy2Cnic();
        b.Name();
        b.Cnic();


    }

}