package com.CodeWithHarry.Shape;
public class Sphere extends Shape 
{

    public Sphere(int dim1) {
        super(dim1, -1);
    }
    public int Area()
    {
        return (int) (Math.PI * this.dim1 * this.dim1 * this.dim1);
    }
    
    
}
