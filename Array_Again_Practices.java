package  com.company;
public  class Array_Again_Practices{
    public static void main(String[] args) {
        // Problem 1

       /* float [] num = {21.3f,41.4f,54,9f,42.9f,53.4f};
        float sum = 0;
        for (float ele: num)
        {
            sum = sum + ele;
        }
        System.out.println("The Sum Of Numbers Are :" + sum);*/

        // Problem 2

        /*int [] arr =  {21,42,45,65,42,12,4576,5};
        boolean isArray = false;
        int no = 32;
        for(int ele : arr)
        {
           if(no == ele)
           {
               isArray = true;
           }
        }
        if (isArray)
        {
            System.out.println("The Value Is Present In Array");
        }
        else
        {
            System.out.println("The Value is Not Present In Array");
        }*/

        // Problem 3


       /* int [] arr = {31,42,45,12,43,12,54,76676,6,45,3,42,3,12,1,21,2,132,3};
        int sum =0;
        for (int ele : arr)
        {
         sum = sum + ele;
        }
        System.out.println("The Average Of The Array Numbers is :" + sum/ arr.length);*/



        // Problem 4

     /*   int [][] arr1 = { {1,2,3 },{3,2,4} };
        int [][] arr2 = { {2,3,6}, {4,6,2} };
        int [][] result = { { 0,0,0 } , {0,0,0} };
        for(int i = 0; i<arr1.length;i++)
        {
            for (int j=0; j<arr1[i].length;j++)
            {
                result[i][j] = arr1[i][j]+arr2[i][j];
                System.out.print(result[i][j] + "  ");
            }
            System.out.println(" ");
        }*/

        // Problem 5

        int [] arr = {10,20,30,40,50,60,70,80,90};
        int l = arr.length;
        int no = Math.floorDiv(l,2);
        for(int i=0; i<no;i++)
        {
                int temp = arr[i];
                arr[i] =  arr[l-i-1];
                arr[l-i-1] = temp;
        }

        for (int ele : arr)
        {
            System.out.println(ele);
        }


        // Problem No 6

        /*int  [] arr  = {21,43,454,3,442,3,13,24,3,35,4,5,234,2,31,3,23,432,54,65,76,7,4546,34,523,413,34};
        int max = Integer.MIN_VALUE;
        for (int ele: arr)
        {
            if(ele > max)
            {
                max = ele;
            }
        }
        System.out.println(max);*/


        // Problem 7

        /*int [] arr = {12,23,12,12,3,24,34,3,54,4,32,34,23,24,3,54,6,5,765,856,7,45,634,5,234,453,2};
        int min = Integer.MAX_VALUE;
        for(int ele : arr)
        {
            if (ele<min)
            {
                min = ele;
            }
        }
        System.out.println(min);*/





        // Problem 8

       /* int [] arr = {323,212,12,13,1,31,22,3,34,5,46,56,5,74,67,67,45,6,45,23,4,134,12,3412,43,124,34};
        boolean isSorted = true;
        for (int i=0; i< arr.length-1;i++)
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
        else
        {
            System.out.println("The Array Is Not Sorted");
        }*/

    }
}