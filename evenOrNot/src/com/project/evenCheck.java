package com.project;

import java.util.*;

public class evenCheck {

    public static boolean evenOr(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }

    }







    public static void main(String[] args){
        Scanner rt = new Scanner(System.in);
        int n =rt.nextInt();
        if(evenOr(n)==true){
            System.out.println(n+" is even");


        }
        else {
            System.out.println(n+"is odd");
        }



    }
}
