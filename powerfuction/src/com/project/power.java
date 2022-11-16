package com.project;

import java.util.Scanner;

public class power {
    public static int p0wer(int n,int m){
        int sol=1;
        for (int  i=1;i<=m;i++){
            sol*=n;
        }
        return sol;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no ");
        int n = sc.nextInt();
        System.out.println("Raised top the power");
        int m = sc.nextInt();
        System.out.println(p0wer(n,m));




    }



}
