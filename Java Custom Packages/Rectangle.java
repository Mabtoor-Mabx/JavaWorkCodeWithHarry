package com.codewithharry.shape;

public class Rectangle
{
     public float surface;
    public float volume;
    public void SurfaceArea(float radius, float height)
    {
       surface = 2 * 3.14f * radius * height;
        System.out.println("The Surface Area Of Rectangle is " + surface);
    }

    public void Volume(float length,float width, float height)
    {
       volume = length * width *  height;
        System.out.println("The Volume Of Rectangle is " + volume);
    }
     

    public static void main(String[] args)
    {
        Rectangle rn = new Rectangle();
        rn.SurfaceArea(2,3);
        rn.Volume(2,3,4);
    }
    
}