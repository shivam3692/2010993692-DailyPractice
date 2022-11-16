package com.project;
import java.util.*;

public class three3 {
   public static void main(String[] args){
    //    System.out.println("ENTER THE NO Y WANNA CHECK PRIME OR NOT");
      //  Scanner df = new Scanner(System.in);
        //int n = df.nextInt();
        //int z =1;
        //for (int i =2;i<=n/2;i++){
          //  if (n%i == 0) {
            //    System.out.println("the no is not prime");
            //break;
           // }
           // else{
            //z+=1;
            // }
        //}
        //if(z == (n/2)){
          //  System.out.println("the no is prime");
       // }

    //question 2 pattern

     //  for (int i =1;i<=4;i++){
           //colmn
       //    for (int j=1;j<=5;j++){
         //     if (j==1||i==1||j==5||i==4){ System.out.print("*");}
           //   else {System.out.print(" ");}
           //}
           //System.out.println();
       //}

       //question4
    //   for (int i =1;i<=4;i++){
      //     for (int j=1;j<=i;j++){
        //       System.out.print("*");
          // }
           //System.out.println();
       //}
//flyoog triange
      // Scanner sc =new Scanner(System.in);
   //    System.out.println("Enter the no u wanna start with");
     //  int n = sc.nextInt();
       //int sum =0;
       //for (int i =1;i<=n;i++){
           //inner loop
         //  for (int j=1;j<=i;j++){
           //    sum+=1;
             // System.out.print(sum+" ");
           //}

           //System.out.println();
      // }


//binary triangle
     //  Scanner sc= new Scanner(System.in);
       //int n = sc.nextInt();

       //for(int i =1;i<=n;i++){
           //inner loop
         //  for (int j =1;j<=i;j++){
       //if ((i+j)%2==0){
         //  System.out.print("1 ");
      // }
        //       else {
                //  System.out.print("O ");
      // }
//parllalogram
       Scanner sc =new Scanner(System.in);
       int n = sc.nextInt();
       for(int i =1;i<=n;i++){
           //inner loop for spcaes
           for (int j=1;j<=(n-i);j++){
               System.out.print(" ");
           }
           //inner loop ofr stars
           for(int j=1;j<=i;j++){
               System.out.print(i+" ");
           }









System.out.println();
           }









    }
}
