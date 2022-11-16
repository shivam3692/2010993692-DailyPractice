package com.project;

import java.util.Scanner;

public class seven_7 {
    public static void main(String[] args){
Scanner fg = new Scanner(System.in);
System.out.println("Enter a no");
int n = fg.nextInt();
        //outer loop
        for (int i =1;i<=n;i++){
            for (int j =1;j<=i;j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
//spaces
                for (int j=n-i;j>=1;j--){
                    System.out.print(" ");
                }

                for (int j=n-i;j>=1;j--){
                    System.out.print(" ");
                }

                for (int j =1;j<=i;j++) {
                    if (j == 1 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }





System.out.println();

            }



        for (int i =n;i>=1;i--){
            for (int j =1;j<=i;j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
//spaces
            for (int j=n-i;j>=1;j--){
                System.out.print(" ");
            }

            for (int j=n-i;j>=1;j--){
                System.out.print(" ");
            }

            for (int j =1;j<=i;j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }





            System.out.println();

        }
















    }




}



