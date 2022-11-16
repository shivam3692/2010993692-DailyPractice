package com.project;

import java.util.Scanner;

public class matrix {


    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();

//creating array 2d
        int matix[][]=new int[m][n];
//taking input
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                Scanner gf = new Scanner(System.in);
               System.out.println(" INput matrix");
                int y =gf.nextInt();
                matix[i][j]=y;
            }
        }
        //print
        System.out.println("WHICH NO u want to find");
        Scanner mn = new Scanner(System.in);
        int x = mn.nextInt();
        for (int  i=0;i<n;i++){
            for (int j =0;j<n;j++){
               int l=0;
               l= matix[i][j];

                if (x ==l ) {
                    System.out.print(x+"FOUND on "+i+","+j);

                }



            }
        System.out.println();
        }


    }
}
