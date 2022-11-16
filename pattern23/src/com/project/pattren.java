package com.project;
import java.util.*;
public class pattren {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //outer loop
    for(int i =1;i<=n;i++){
        //spaces
        for (int  j=1;j<=n-i;j++){
System.out.print(" ");
        }

        //inner loop
        for (int j =i;j>0;j--){
            System.out.print(j+" ");
        }
        for(int j=2;j<=i;j++){
            System.out.print(j+" ");
        }

        System.out.println();
    }



}
}
