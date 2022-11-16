package com.project;
import java.util.*;
public class count {
    public static void main(String[] args){
        int coutp = 0;
        int coutn =0;
        int cout0 =0;
        for (;;) {
System.out.println("Do you want to enter no 1 for yes");
Scanner mf = new Scanner(System.in);
int n = mf.nextInt();
if (n == 1){
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            if (m==0){
                cout0+=1;
            }
            if (m>0){
                coutp+=1;
            }
            if (m<0){
                coutn+=1;
            }
        }
else {
    System.out.println("zeros"+cout0);
    System.out.println("positive"+coutp);
    System.out.println("negative"+coutn);
    break;
}
        }




    }
}
