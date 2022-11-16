package com.project;

import java.util.Scanner;

public class fab {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       int a =0;
       int b =1;
       for (int i =0;i<n;i++){
           if (i==0){
               System.out.print(0+",");
           }
           if (i==1)
               System.out.print(1+",");
           else {
               int c =a+b;
               a = b;
               b =c;
               System.out.print(c+",");

           }



       }




    }
}
