package com.project;
import java.util.*;
public class stringTwo {
    public static void main(String[] args){
Scanner sc =new Scanner(System.in);
int n =sc.nextInt();
        String[] names = new String[n];
//input
        for (int i =0;i<n;i++){
            Scanner ny = new Scanner(System.in);
            names[i]=ny.next();

        }
        //calculating combined length
        int m =0;
        for (int i =0;i<n;i++){
            m+=names[i].length();

        }
System.out.println(m);

    }


}
