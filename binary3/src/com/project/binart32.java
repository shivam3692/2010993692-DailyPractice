package com.project;
import java.util.*;

public class binart32 {
    public static int coutno(int n){
        return (int)(Math.log(n)/Math.log(2)+1);
    }

    public static void main(String args[]){
        Scanner df = new Scanner(System.in);
        int n = df.nextInt();
        int z =coutno(n);
        int no =0;
        for (int i=0;i<z;i++){
            int bitmask=1<<i;
            if ((n&bitmask)!=0){
                no+=1;
            }
        }
System.out.println("no of 1's in "+no);
    }
}
