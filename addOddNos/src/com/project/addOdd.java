package com.project;
import java.util.*;
public class addOdd {
    public static int sumOfOdd(int n){
int su =0;
        for (int i=1;i<=n;i++){

            if (i%2==0){

            }
            else {
                su+=i;
            }
        }
        return su;
    }
    public static void main(String[] args){

        Scanner fg = new Scanner(System.in);
        int n = fg.nextInt();
        System.out.println(sumOfOdd(n));


    }




}
