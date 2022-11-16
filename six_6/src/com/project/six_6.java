package com.project;
import java.util.*;
public class six_6 {
    public static void main(String[] args){
        Scanner fg =new Scanner(System.in);
        System.out.println("pls enter the no here");
        int n = fg.nextInt();


        //outer loop
        for (int i =1;i<=n;i++){
            //space loop
            for (int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            //loop for stars
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            //second part
            for (int j =2; j<=i;j++){
                System.out.print("*");
            }



                System.out.println();


        }


        for (int i =n;i>=1;i--){
            //space loop
            for (int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            //loop for stars
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            //second part
            for (int j =2; j<=i;j++){
                System.out.print("*");
            }



            System.out.println();


        }








    }


}
