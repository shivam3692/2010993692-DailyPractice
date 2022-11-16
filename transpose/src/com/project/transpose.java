package com.project;
import java.util.*;
public class transpose {
    public static void main(String[] args) {
        //creating arrsay matrix
        Scanner fg = new Scanner(System.in);
        int m = fg.nextInt();
        int n = fg.nextInt();

        int a[][] = new int[m][n];
        //input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Scanner df = new Scanner(System.in);
                int y = df.nextInt();

                a[i][j] = y;
            }
        }

        //print the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


        // transpose
            for (int j =0;j<n;j++){
               for (int i =0;i<m;i++){
                 System.out.print(a[i][j]);
           }
                 System.out.println();
           }

    }
}