package com.project;
import java.util.*;

public class reccur5 {
   public static void facb (int n,int i ,int a,int b ){

       if (i==1){
           System.out.println(a);
           facb(n, i + 1, a, b);
           return;
       }
       if(i==2){
           System.out.println(b);
           facb(n, i + 1, a, b);
           return;
       }
       if(i>n){
           return ;
       }

       System.out.println(a+b);
       facb(n, i + 1, b,a+b);
   }     bbbb000




    public static void main(String[] args){
       int i=1;
       int a =0;
       int b =1;
     facb(10,i,a,b);


    }
}
