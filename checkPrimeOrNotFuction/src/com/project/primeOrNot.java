package com.project;
import java.util.*;
public class primeOrNot {
    public static boolean primeO (int n){
if(n==0||n==1){
    return false;
} else if (n==2) {
    return true;

}
else {
    int m =1;
    for (int i =2;i<=n/2;i++){
        if (n%i==0){

        }
        else {
            m+=1;
        }
    }
    if(m==n/2){
        return true;
    }
    else {
        return false;
    }

    }
    }


    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if(primeO(n)==false){
    System.out.print(n+" is NOT prime");
}
else {
    System.out.println(n+" is prime");
}





    }
}
