package com.company;

public class  MyWorking
{
    public static void main(String[] args)
    {

      /*  float [] no = {21.6f,78.8f,98.9f,52.3f,5.0f};
        float sum = 0;
        for (float ele : no){
            sum = sum + ele;
        }
        System.out.println(sum);*/


//        int [] arr = {21,32,4,4,3,2,2,43,54,643,5,3,434,3};
//        int no = 5;
//        boolean isArray= false;
//        for (int ele : arr)
//        {
//            if (no == ele)
//            {
//                isArray = true;
//            }
//        }
//        if (isArray)
//        {
//            System.out.println("Number Is Found In Array");
//        }
//        else
//        {
//          System.out.println("Number Is Not Found In Array");
//        }


//        int []  arr = {12,11,10,23,43};
//        int sum = 0;
//        for(int ele : arr)
//        {
//            sum = sum + ele;
//        }
//
//        System.out.println(sum/ arr.length);



       /* int [] [] arr1= {{1,1,1},{1,2,3} };
        int [] [] arr2 = { {1,2,4}, {2,3,5}};
        int [] [] res = {{0,0,0}, {0,0,0}};
        for (int i =0; i<arr1.length;i++)
        {
            for (int j =0;  j<arr1[i].length;j++)
            {
                res[i][j]= arr1[i][j] + arr2[i][j];
                System.out.print(res[i][j] + " ");
            }
            System.out.println("\n");
        }*/




      /*  int [] arr =  {20,40,60,80,100};
        int l = arr.length;
        int no = Math.floorDiv(l,2);

        for (int i =no; i>=0; i--)
        {
            int temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }

        for (int ele : arr)
        {
            System.out.println(ele);
        }*/



//        int [] arr = {2,32,32,4,34,23,2,2,12,1,32,432,3,2};
//        int no = Integer.MAX_VALUE;
//
//        for (int ele : arr)
//        {
//            if (no>ele)
//            {
//                no = ele;
//            }
//        }
//        System.out.println(no);




      /*  int [] arr = {1,1233,23,2,32,3,24,2,32,32,434,34,3,32,32,3,2323232,32,32,32,3};
        int no = Integer.MIN_VALUE;
        for (int ele: arr)
        {
            if (ele>no)
            {
                no = ele;
            }
        }
        System.out.println(no);*/


/*


        int [] arr = {12,1,223,2,32,43,323,2,31,2,1,2};
        boolean isSorted = true;
        for(int i =0; i<arr.length-1;i++)
        {
            if (arr[i] > arr[i+1])
            {
                isSorted = false;
            }
        }
        if (isSorted)
        {
            System.out.println("The Array Is Sorted");
        }
        else {
            System.out.println("The Array Is Not Sorted");
        }






int no = 4;
for (int i = no; i>0;i--)
{
    for ( int j=0; j<=i; j++)
    {
        System.out.print("*");
    }
    System.out.print("\n");
}




        int  no = 4;

        int sum =0;
        for (int i=0; i<no;i++)
        {
            sum = sum + (2*i);
        }

        System.out.println(sum);





        int no = 6;

        for (int i =1; i<=10; i++)
        {
            System.out.println(no + " x " + i + " = " + no*i);
        }


*/

        int no = 9;
        for (int i = 10; i>0;i--)
        {
            System.out.println(no + " x " + i + " = " + no*i);
        }




//        int no = 4;
//        int fac = 1;
//        for (int i=1 ; i<=no; i++)
//        {
//            fac*=i;
//        }
//        System.out.println(fac);


/*
int no = 6;
int fac= 1;
int i = 1;
while (i<=no)
{
    fac*=i;
    i++;
}
        System.out.println(fac);

*/


int  a = 10;
if (a == 11)
{
    System.out.println("I am 11");
}
else
{
    System.out.println("I am not 11");
}
























    }
}