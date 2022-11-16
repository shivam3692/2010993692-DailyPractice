package com.project;
import java.util.*;
public class patty {
    public static void main(String[] args){
     Scanner sc =new Scanner(System.in);
     int n  =sc.nextInt();
     int m = sc.nextInt();
        int[][] array= new int [m][n];
        //input
     for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
             array[i][j]=sc.nextInt();
         }
     }

     Scanner sv =new Scanner(System.in);
     int a =0;
     int b =0;


//print
        for (int i=a;i<m-a;i++){
            for(int j=a;j<n-a;j++){
                if (i==a||j==n-1-a){
                    System.out.print(array[i][j]);
                }
            }
        }
        for(int i=a;i<m-a-1;i++){
            for (int j=n-1-a;j>0;j--){
                if (i==m-a && j!=a &&j!=n-a){
                    System.out.print(array[i][j]);
                }
            }
        }
        for (int i=m-a-1;i>a;i--){
            for (int j=a;j<n-1-a;j++){
                if (i==a&&j!=a){
                    System.out.print(array[i][j]);
                }
            }

        }






    }




}
