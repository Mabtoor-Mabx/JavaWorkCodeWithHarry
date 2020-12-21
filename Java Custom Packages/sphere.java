package com.codewithharry.shape;

public class sphere extends Rectangle
{

public void SurfaceArea(float length , float width)
{
     surface =  3 * length * width * length; 
     System.out.println("The Surface Area Of Sphere is : " + surface);
}


public void Volume(float length)
{
    volume = 3* 3.14f * length * length * length;
    System.out.println("The Volume of Sphere is : " +volume );
}

public static void main(String[] args)
{
    Square sq = new Square();
    sq.SurfaceArea(2,3);
    sq.Volume(2);
}

}