package com.project;
import java.util.*;
public class bubble {
    public static void main(String args[]){
        //input an array
        int[] arr={9,8,7,1,2,3};
        //bubble sorting
        for(int j=0;j< arr.length-1;j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int m = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = m;
                }
            }
        }
//output
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
