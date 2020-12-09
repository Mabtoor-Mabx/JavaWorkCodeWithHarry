package  com.company;

interface Call
{
    void PickCall();
    default void greet()
    {
        System.out.println("Good Morning! Mr ! Have A Good Day");
    }
    void CancelCall();
}

interface  Video
{
    void AddVideo();
    void DeleteVideo();
}
interface  Wifi
{
    void AddNetwork();
    void RemoveNetwork();
}

class  phone
{
    public  void On()
    {
        System.out.println("Mobile On");
    }
    public  void Off()
    {
        System.out.println("Mobile Off");
    }
}

class  SmartPhone extends  phone implements  Call , Video , Wifi
{
    public void AddVideo()
    {
        System.out.println("Video is Added...");
    }

    public  void  DeleteVideo()
    {
        System.out.println("Video Is Removed...");
    }
    public  void PickCall()
    {
        System.out.println("Pick Up The Call...");
    }
    public  void CancelCall()
    {
        System.out.println("Call Ended...");
    }
     public  void AddNetwork()
    {
        System.out.println("WIFI  Is Connected...");
    }

    public  void RemoveNetwork()
    {
        System.out.println("WIFI Disconnected");
    }

}



public  class  Default
{


    public static void main(String[] args)
    {
     SmartPhone sm = new SmartPhone();
     sm.On();
     sm.greet();
     sm.PickCall();
     sm.CancelCall();
     sm.AddNetwork();
     sm.RemoveNetwork();
     sm.AddVideo();
     sm.DeleteVideo();
     sm.Off();


    }

}