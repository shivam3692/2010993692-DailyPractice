package com.project;
import java.util.*;
public class recurrsionOne {
public static int print(int n){
    if(n==1){
        return 1;
    }
    System.out.println(n);
    return print(n-1);
}





    public static void main(String[] args){

/*recursion : in recursion fuction call itself
always a base condition is required to stop[p at a point
its takes more time than loop as at every step new integer is created
 */

        //print nos from 5to1
System.out.println(print(5));








    }
}
