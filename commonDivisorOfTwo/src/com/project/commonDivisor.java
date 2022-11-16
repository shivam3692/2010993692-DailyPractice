package com.project;
import java.util.*;
public class commonDivisor {
    public static int commonDivisor(int n ,int y){
        int z =0;
        if (n>y){
            for (int i=2;i<=y;i++){
                if (n%i==0 && y%i==0){
                    z=i;

                }
                else{
                    z=0;
                }

            }
        }
        else {
            for (int i=2;i<=n;i++){
                if (n%i==0 && y%i==0){
                    z=i;
                }

                else {
                    z =0;

                }
            }

            }
        return z;
    }

    public static void main(String[] args) {
System.out.println("Enter two nos to find the common divisor of");
Scanner sc =new Scanner (System.in);
int m =sc.nextInt();
int n =sc.nextInt();

if (commonDivisor(m,n)==0){
    System.out.println("no common divisor");
}
    else {
        System.out.println(commonDivisor(m,n)+" is the common divisor of the nos ");
    }


    }
}





