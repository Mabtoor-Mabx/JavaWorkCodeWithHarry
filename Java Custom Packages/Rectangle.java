package com.CodeWithHarry.Shape;
public class Rectangle extends Shape 
{
   public Rectangle(int dim1, int dim2)
   {
       super(dim1,dim2);
   }
    public int area()
    {
        return this.dim1 * this.dim2;
    }
}
