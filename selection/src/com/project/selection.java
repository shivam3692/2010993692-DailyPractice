package com.project;
import java.util.*;
public class selection {
    public static void main(String args[]){
        //input an array
        int[] arr={9,8,7,2,3,1};
        //selection sort


for(int i=0;i< arr.length-1;i++){
    int samllest=i;
    for (int j=i+1;j< arr.length;j++) {
        if (arr[j] < arr[samllest]) {
            samllest = j;
        }
    }    //we will get j which is the position of the smallest elemnt in  the array
        //swap it with the starting element
        int temp=arr[i];
        arr[i]=arr[samllest];
        arr[samllest]=temp;


}
//output
        for (int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }


}}

