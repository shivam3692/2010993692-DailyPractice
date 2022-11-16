package com.project;
import  java.util.*;
public class printTab {

    public static void table(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }





    public static void main(String[] args){
        Scanner mu = new Scanner(System.in);
        int n =mu.nextInt();
        table(n);

    }
}
