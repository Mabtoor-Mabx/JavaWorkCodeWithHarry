package  com.company;

// Problem1
/*

class  cylinder
{
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

public  class Assignment_9
{
    public static void main(String[] args)
    {
     cylinder cy = new cylinder();
     cy.setWidth(3);
     cy.setHeight(5);
        System.out.println(cy.getHeight());
        System.out.println(cy.getWidth());
    }
}*/


// Problem 2
/*

class Cylinder
{
    private  int height;
    private  int width;

    public  void setwidth(int width)
    {
        this.width = width;
    }
    public int getWidth()
    {
        return width;
    }
    public void setheight(int height)
    {
        this.height = height;
    }
    public   int getHeight()
    {
        return height;
    }
}

public class Assignment_9
{
    public static void main(String[] args)
    {

        Cylinder newcy = new Cylinder();
            newcy.setwidth(5);
            newcy.setheight(4);
        double r = newcy.getWidth();
        double h = newcy.getHeight();
        double v = ( 2 * Math.PI * r * h ) + (2 * Math.PI * r * r);
        System.out.println(v);



    }
}*/


// Problem 3
/*


class Cylinder
{
    private  int height;
    private  int width;

    public Cylinder(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}

public  class  Assignment_9
{
    public static void main(String[] args)
    {
     Cylinder cy = new Cylinder(21,10);
        System.out.println(cy.getHeight());
        System.out.println(cy.getWidth());
         }
}*/



// PROBLEM 4
/*

    class constructor
    {
        private  int width;
        private  int height;
        public constructor()
        {
         this.height = 4;
         this.width = 5;
        }
        public   constructor(int width, int height)
        {
            this.height=height;
            this.width=width;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }
    }


    public class Assignment_9
    {

        public static void main(String[] args)
        {
            constructor cu = new constructor();
            System.out.println(cu.getWidth());
            System.out.println(cu.getHeight());


        }
    }*/



// Problem 5


class Sphere
{
    private  int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}


public  class Assignment_9
{
    public static void main(String[] args)
    {
        Sphere se = new Sphere();
        se.setR(4);
       double radius =se.getR();
        double sphere = 4 * Math.PI * radius * radius;
        System.out.println(sphere);
    }
}