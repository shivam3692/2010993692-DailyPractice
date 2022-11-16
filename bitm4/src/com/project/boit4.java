package com.project;
import java.util.*;
public class boit4 {
    public static int powerOf(int n,int x){
        if(x==0){
            return 1;
        }
        return n*(powerOf(n,x-1));
    }


    public static int binarytoDecimal(int arr[]){
      int n= arr.length;
      int z=0;
        for (int i=n-1;i>=0;i--){
            for (int j=0;j<n;j++){
              z+= ((arr[j])*powerOf(2,i));
            }
        }
return z;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("what is no of digits in your digits");
      int n = sc.nextInt();
      int[] arr=new int[n];
      for (int i =0;i<arr.length;i++){
          Scanner fg =new Scanner(System.in);
          int y = fg.nextInt();
          arr[i]=y;
      }
      System.out.println(binarytoDecimal(arr));

    }
}
