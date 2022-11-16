package com.project;
import java.util.*;
public class four4 {
    public static int fac(int x){
        int sol=1;
        if(x==0||x==1){
            return 1;
        }
        else {
            for(int i =2;i<=x;i++){
                sol*=i;
            }
        }

        return sol;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();


        System.out.println(fac(x));



    }





}
