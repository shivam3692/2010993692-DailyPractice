package com.project;

public class recurr2 {
   //print 1 to 5
   public static int print(int n,int i){

       int z=i+1;
       if(z==n){
           return n ;
       }
       else {
           System.out.println(z);
       }

       return print(n,z);
   }


    public static void main(String[] args){
        int  i =0;
System.out.println(print(5,i));
    }
}
