package com.project;
import java.util.*;
public class fourFour {
    // public static void main(String [] args){
    //outer loop
    //  Scanner gh =new Scanner(System.in);
    // int n = gh.nextInt();
    // for(int i=1; i<=n;i++){
    //spaces
    //   for(int j =n-i;j>=1;j--){
    //      System.out.print(" ");
    // }

    //inerr loop for part 1
    //for (int j =1;j<=i;j++){
    //  System.out.print(i-j+1+" ");

    //        }
    //for (int j=2;j<=i;j++){
    //  System.out.print(j+" ");
    // }

    // System.out.println();

    //}


    //}
    public static void main(String[] args) {
//butterfly pattern
        //first wing
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            //innerlopp
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            //innerlopp
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}










