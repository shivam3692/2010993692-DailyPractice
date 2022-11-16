package com.project;

import java.util.Scanner;

public class sorTing {
    public static void main(String[] args){
        int[] array=new int [5];
System.out.println("input array");
        for (int i=0;i< array.length;i++){
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    array[i]=n;
}

     //bubble sort
        for (int j=0;j< array.length-1;j++){
        for(int i=0;i< array.length-1-j;i++){
            if (array[i]>array[i+1]){
                int m=array[i];
                array[i]=array[i+1];
                array[i+1]=m;
            }
        }}

        for (int i =0;i< array.length;i++){
            System.out.print(array[i]+",");
        }
    }
}
