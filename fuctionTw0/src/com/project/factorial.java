package com.project;

import java.util.*;

public class factorial {
public static int  factori(int n){
   int fac =1;
   for (int i = 2;i<=n;i++){
       fac*=i;
    }


    return fac;
}


    public static void main(String[] args){

        Scanner fg =new Scanner(System.in);
        int x = fg.nextInt();
        System.out.println(factori(x));



    }
}
