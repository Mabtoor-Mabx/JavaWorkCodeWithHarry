package com.company;



// Polymorphism In Interfaces

class  Phone2
{
    void call(int n)
    {
        System.out.println("Calling A Number " + n);
    }
    void Receive()
    {
        System.out.println("Receiving Mobile Number ");
    }
}

interface Wifi2
{
    void AddNetwork();
    void RemoveNetwork();
}

interface  Audio2
{
    void PlayAudio();
    void AddAudio();
    void PauseAudio();
    void DeleteAudio();
}

interface  Video2
{
    void CaptureVideo();
    void AddVideo();
    void PlayVideo();
    void PauseVideo();
    void DeleteVideo();
}
 interface  Picture2
 {
     void AddPhoto();
     void ClickPhoto();
     void ViewPhoto();
     void DeletePhoto();
 }

 class  Smartphone2 extends  Phone2 implements Wifi2, Audio2 , Video2 , Picture2
 {
     public void AddNetwork()
     {
         System.out.println("Add A Network!!!");
     }
    public void RemoveNetwork()
     {
         System.out.println("Remove A Network!!!");
     }

     public void PlayAudio()
     {
         System.out.println("Playing Audio!!!");
     }
     public void AddAudio()
     {
         System.out.println("Add Audio Files!!!");
     }
     public void PauseAudio()
     {
         System.out.println("Pause Audio !!!");
     }
     public void DeleteAudio()
     {
         System.out.println("Delete Audio File!!!");
     }


     public void CaptureVideo() {
         System.out.println("Capture Video!!! ");
     }
     public void AddVideo()
     {
         System.out.println("Add Video Files!!!");
     }
     public void PlayVideo()
     {
         System.out.println("Play Video !!!");
     }
     public void PauseVideo()
     {
         System.out.println("Pause A Video !!!");
     }
     public void DeleteVideo()
     {
         System.out.println("Delete Videos !!!");
     }


     public void AddPhoto()
     {
         System.out.println("Add  Photos!!!");
     }
     public void ClickPhoto()
     {
         System.out.println("Click Photos!!!");
     }
     public void ViewPhoto()
     {
         System.out.println("View Photos!!!");
     }
     public void DeletePhoto()
     {
         System.out.println("Delete Photos!!!");
     }

 }


 public  class Polymrphism
 {

     public static void main(String[] args)
     {
         Wifi2  wifi = new Smartphone2();
         wifi.AddNetwork();
         wifi.RemoveNetwork();

         // Wifi Kay Reference Walay Hi Methods Run HOOn gay Warna nahi Hoon gay.
         // Hum Jo Reference Bnaein gay Sirf Us kAy mEthods Call Ho skty hain warna Aur Koi Method CAll Nahi Ho Sakta.

     }


 }