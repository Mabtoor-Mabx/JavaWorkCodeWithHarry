package com.CodeWithHarry.Shape;
public class Circle extends Shape
{

    public Circle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public int Area()
    {
        return (int) (Math.PI * this.dim1 * this.dim1 * this.dim2);
    }
    
    
}
