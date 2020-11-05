package com.company;
public class Array_Assignment{
    public static void main(String[] args) {
//        float [] arr = {21.4f,54.3f,58.5f,78.87f,6.75f};
//        float sum = 0;
//        for( float element : arr ){
//            sum = sum + element;
//        }
//        System.out.println(sum);


       /* int [] arr = {12,13,4,45,56,32,12,54};
        int no  = 43;
        Boolean isInArray = false;
            for(int ele : arr)
            {
                if(no==ele){
                isInArray = true;
                }
            }
            if (isInArray){
                System.out.println("The Value is Found In Array");
            }
            else{
                System.out.println("The value is Not Found in Array");
            }*/


        /*int [] arr = { 21,31,34,12,42,12};
        int sum = 0;
        for(int ele: arr){
            sum = sum + ele;
        }
        System.out.println("The Average Of Number is " +  sum/arr.length);*/

/*
            int[][] matr1 = { {0,0,0},{0,1,0} };
            int[][] matr2 = { {1,0,0}, {1,1,1}};
            int[][] ans =   { {0,0,0}, {0,0,0} };
            for (int i =0; i<matr1.length;i++){
                for (int j=0; j<matr1[i].length; j++){
                    ans[i][j] = matr1[i][j] + matr2[i][j];
                    System.out.print( ans[i][j] + "  ");
                }
                System.out.println("");
            }*/


       /* int[] arr = {21,31,1,21,32};
        int l = arr.length;
        int num = Math.floorDiv(l,2);

        for (int i = 0;i<num;i++)
        {
             int temp = arr[i];
             arr[i] = arr[l-i-1];
             arr[l-i-1] = temp;

        }
        for (int ele : arr){
            System.out.println(ele);
        }*/



      /*  int []  arr  = {12,31,12,32,34,35};
        int no = Integer.MIN_VALUE;
        for(int ele : arr){
            if(ele>no)
            {
                no = ele;
            }
        }
        System.out.println(no);*/

        /*int[] arr = {21,12,432,45,5234,213,3,212,12,12,12,12};
            int min = Integer.MAX_VALUE;
            for(int ele: arr){
                if(ele<min){
                    min = ele;
                }
            }
        System.out.println(min);
            }
        }*/

    int [] a ={1,10,31,102,321,432};
    boolean isTrue = true;
    for (int i=0;i<a.length-1 ;i++){
        if(a[i] > a[i+1])
        {
            isTrue = false;
            break;
        }

    }

            if(isTrue)
            {
                System.out.println("The Array Is Sorted");
            }
            else{
                System.out.println("The Array is Not Sorted");
            }


        }
    }

