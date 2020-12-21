package com.codewithharry.shape;

public class Square extends Rectangle
{

public void SurfaceArea(float length , float width)
{
     surface = length * width * length; 
     System.out.println("The Surface Area Of Square is : " + surface);
}


public void Volume(float length)
{
    volume = length * length * length;
    System.out.println("The Volume of Square is : " +volume );
}

public static void main(String[] args)
{
    Square sq = new Square();
    sq.SurfaceArea(2,3);
    sq.Volume(2);
}




}