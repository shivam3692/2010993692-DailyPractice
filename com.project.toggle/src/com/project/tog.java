package com.project;
import java.util.*;
public class tog {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no");
        int n =sc.nextInt();
        System.out.println("enter pos");
        int pos = sc.nextInt();
        int bismask=1<<pos;
        //get
        if((n&bismask)==0){
            int z=n|bismask;
            System.out.println(z);
        }
        else {
            int v =~bismask;
            int b =n&v;
            System.out.println(b);
        }
    }
}
