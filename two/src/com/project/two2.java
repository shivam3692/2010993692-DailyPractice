package com.project;
import java.util.*;

public class two2 {
    public static void main(String[] argas){
        //loops printing all nos
        //print even nos till n
     //   Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
     //   int i =2;
       // while(i<=n){
         //   if(i%2==0){
           //     System.out.println(i);

            //}
       // ;i++;
       //
        // }
//question 2 loops
Scanner rf = new Scanner(System.in);
int n = rf.nextInt();
        while(n == 1){



            System.out.println("enter the marks of the student");
            int i =rf.nextInt();
                if ( i > 100){
                    System.out.println("pls enter marks out of 100");
                } else if (i<= 100) {
                    if (i >= 90) {
                        System.out.println("this is good marks");
                    } else if (i<=89 && i>=60){
                        System.out.println("this is also good marks");


                    } else {
                        System.out.println("this is also good but effort matters");

                    }
                };i++;

            }





    }
}
