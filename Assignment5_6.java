package com.company;
public class Assignment5_6{
    public static void main(String[] args)
    {

     /*int no = 4;
     int sum =0;
     for(int i =no; i>0;i--)
     {
         for (int j=0; j<i;j++)
         {
             System.out.print("*");
         }
         System.out.print("\n");
     }*/

       /* int n = 3;
        int sum =0;
        for(int i=0; i<n;i++)
        {
            sum = sum + (2*i);
        }
        System.out.println(sum);*/




/*
        int n = 4;
        int sum =0;
        int i = 0;
        while(i<n)
        {
            sum = sum + (2*i);
            i++;
        }
        System.out.println(sum);*/


        /*int no = 4;
        for(int i =0; i<=10;i++)
        {
            System.out.println(no + " x " + i + "  =  " + no*i);
        }*/


       /* int no = 9;
        for (int i = 10; i>0; i--)
        {
            System.out.println(no + " x " +  i  + " =  " + no*i);
        }*/




       /* int no = 4;
        int fac = 1;
        for (int i =1; i<=no;i++)
        {
            fac*=i;
        }
        System.out.println(fac);*/








       /* int no = 5;
        int fac = 1;
        int i =1;
        while(i<=no)
        {
            fac*=i;
            i++;
        }
        System.out.println(fac);*/



       /* float [] arr = {21.4f,53.21f,34.21f,54.23f,35.32f};
        float sum = 0;
        for (float ele: arr)
        {
            sum = sum + ele;
        }
        System.out.println(sum);*/


//        int [] arr = {12,12,13,23,1,3,1,21,3,24,3,43};
//        int no = 23;
//        boolean isArray = false;
//        for (int ele: arr)
//        {
//            if (no == ele)
//            {
//                isArray = true;
//            }
//
//        }
////        if (isArray)
//        {
//            System.out.println("The Value Is Present In Array");
//        }
//        else
//        {
//            System.out.println("The Value Is Not Present In Array");
//        }




/*int [] arr = {1,22,3,242,3,12,1,2,4,34,2};
int sum = 0;
for (int ele: arr)
{
    sum = sum + ele;
}
        System.out.println(sum / arr.length);*/




       /* int [] [] arr1 = {{0,1,1},{0,0,1}};
        int [] [] arr2 = {{0,0,1}, {1,1,1}};
        int [] [] res = {{0,0,0} , {0,0,0}};
        for (int i = 0; i<=arr1.length;i++)
        {
            for (int j =0; j<=arr1[i].length-1;j++)
            {
                res[i][j]= arr1[i][j]+arr2[i][j];
                System.out.print(res[i][j] + "  ");
            }
            System.out.println("");
        }*/



    /*   int [] arr = {10,20,30,40,50,60,70,80,90};
       int l = arr.length;
       int no = Math.floorDiv(l,2);
       for (int i=0;i<no;i++)
       {
           int temp = arr[i];
           arr[i]= arr[l-1-i];
           arr[l-1-i] = temp;
       }
       for (int ele : arr)
       {
           System.out.println(ele);
       }
*/


      /*  int [] arr = {12,321,3,23,24,2,3,2,31};
        int no = Integer.MIN_VALUE;
        for (int ele : arr)
        {
            if (no<ele)
                no = ele;
        }
        System.out.println(no);*/



/*
        int [] arr = {21,2121,2,13,2,3,22,1,3,23,2,3,23};
        int no = Integer.MAX_VALUE;
        for (int ele: arr)
        {
            if (no>ele)
            {
                no = ele;
            }

        }
        System.out.println(no);*/


//
//       int [] arr = {1,23,43,54,65,74,85,410,2230,2241,5322,81873};
//       boolean isSorted = true;
//       for (int i =0; i<arr.length-1; i++)
//       {
//           if (arr[i] > arr[i+1])
//           {
//               isSorted = false;
//           }
//       }
//          if (isSorted)
//          {
//              System.out.println("The Value is Sorted");
//          }
//          else
//          {
//              System.out.println("The Value Is Not Sorted");
//          }




















    }
}
