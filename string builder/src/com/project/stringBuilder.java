package com.project;
import java.util.*;
import java.util.Arrays;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        //input sizer of array
        int n = sc.nextInt();
        //input sum u want
        int s =sc.nextInt();
        //creating array
        int array[]= new int [n];
        //taking input in an array
        for(int y =0;y<array.length;y++){

            array[y]=sc.nextInt();
        }


        for(int i =0;i<array.length;i++){
            for(int j =i;j<array.length;j++){
                int[] b =array.copyOfRange(array,i,j);
                int sum=0;
                for(int m =i;m<=j;m++){
                    sum+=b[m];
                    if (sum==s){
                        System.out.print(i);
                        System.out.print(m);
                        break;
                    }
                }

            }

        }





    }




}