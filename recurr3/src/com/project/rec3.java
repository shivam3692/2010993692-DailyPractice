package com.project;
import java.util.*;
public class rec3 {
    //su of n using reccursion
public static int sum1(int n,int sum,int i){
    if(i>n){
        return sum;
    }

    sum+=i;

    return sum1(n,sum,i+1);
}




    public static void main(String[] args){
int i =1;
int sum=0;
System.out.println(sum1(3,sum,i));
    }
}
