package com.project;
import java.util.*;
public class bin {
public static void main(String[] args){
 /*   //get
    int n=5;

    int b =1<<2;
    if ((n&b)==0){
        System.out.println("Zero at this position");
    }
    else{
        System.out.println("1 at this position");
    }

*/
/*set means 0 to 1
    int n =5;
    int b=1<<1;
    System.out.println(n|b);
*/
    //clear means 1 to 0;
    int n=5;
    int b=1<<0;
    int y=~b;
    System.out.println((n&y));


}


}
