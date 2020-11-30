package  com.company;

class Access
{
    private  int r;

    public void SetArea(int no)
    {
        if (no>0)
        {
            r = no * no;

        }
        else
        {
            System.out.println("Wrong Radius Found");
        }

    }

    public int GetArea()
    {
        System.out.println(r);
        return r;
    }

}


public class  Access_Modifier
{
    public static void main(String[] args)
    {
     Access ac = new Access();
     ac.SetArea(0);
        ac.GetArea();

    }
}