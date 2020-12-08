package  com.company;

// Problem 1

/*
class  Circle2
{

    Circle2()
    {
        System.out.println("I am Constructor With No Parameter");
    }
    Circle2(int radius)
    {
        System.out.println("I am Constructor With One Parameter " + radius);
    }
}

class  Cylinder2 extends  Circle2
{

    Cylinder2(int height)
    {
        super(4);
        System.out.println("I am Height Constructor With One Parameter " + height);
    }
}

public  class  Assignment_10
{

    public static void main(String[] args)
    {

        Cylinder2 cy = new Cylinder2(2);


    }


}*/



// Problem 2

/*

class  Rectangle2
{
    int radius;
    Rectangle2(int radius)
    {
        this.radius = radius;
    }

    public  int getRadius()
    {
        return  radius;
    }
}

class  Cuboid extends  Rectangle2
{
    int height;
    Cuboid(int height)
    {
        super(3);
        this.height = height;
    }
    public  int getHeight()
    {
        return   height;
    }
}


public  class  Assignment_10
{

    public static void main(String[] args)
    {

        Cuboid cy = new Cuboid(4);
        System.out.println("The Volume Of Rectangle is " + 2 * Math.PI * cy.getRadius());
        System.out.println("The Volume Of Cuboid Is " + 2 * Math.PI * cy.getRadius() * cy.getHeight());
    }



}


 */


// Problem 3
/*

class  Circle4
{
    double radius;

    Circle4(double r)
    {
        radius =  Math.PI * r * r ;
        System.out.println("The Area Of Circle : " + radius);
    }
   public double Volume(double r , double h)
    {
        radius = 2 * Math.PI * r * h;
        System.out.println("The Volume Of Circle Is : " + radius);
        return  radius;
    }
}

class  Cylinder4 extends  Circle4
{

    Cylinder4(double r)
    {
        super(2);
        double radius = Math.PI * r * r * r;
        System.out.println("The Area Of Cylinder is : " + radius);
    }

    public  double Volume2( double r , double h)
    {
        radius = 3 * Math.PI * r * h;
        System.out.println("The Volume Of Cylinder Is : " + radius);
        return  radius;
    }
}


public  class  Assignment_10
{

    public static void main(String[] args)
    {

        Cylinder4 cy = new Cylinder4(3);
        cy.Volume(3, 4);
        cy.Volume2(3,4);

    }

}*/



// Problem 4


class  Rectangle
{
    int radius;

    public int getRadius() {
        return  radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


}

class  Cuboid extends  Rectangle
{
    int height;

    public int getHeight() {
        return  height;
    }

    public void setHeight(int height) {
        this.height = height;

    }


}


public  class  Assignment_10
{

    public static void main(String[] args) {
        Cuboid ct = new Cuboid();
        ct.setHeight(2);
        ct.setRadius(3);
        System.out.println("The Volume Of Rectangle is " + 2 * Math.PI * ct.getRadius() * ct.getHeight());
        System.out.println("The Volume Of Cuboid is " + 3 * Math.PI * ct.getRadius() * ct.getHeight());
    }

}