package com.project;
import java.util.*;
public class sort1 {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
        int arr[]= new int[n];
//intput
        for (int i =0;i<n;i++){
            Scanner lu =new Scanner(System.in);
            int m = lu.nextInt();
            arr[0]=m;
        }
       for (int j=0;j<n-1;j++){
        for(int i=0;i<n-j-1;i++){
            if (arr[i] > arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }


        }}
       for (int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }



    }


}
