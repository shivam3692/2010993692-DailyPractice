package com.project;
import java.util.*;
public class bitm {
    public static int coutbitsInaNO(int number) {
        int z = (int) (Math.log(number) /
                Math.log(2) + 1);

        return z;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =0;
        int z = coutbitsInaNO(n);
        for (int i = 0; i < z; i++) {
            int b = 1 << i;
            if (i < z - 1) {

                if ((n & b) == 0) {
m+=1;

                }

            }
        }
        if(m==z-1){
        int b=1<<z-1;
        if ((n&b)!=0){
            System.out.println(n+" power of 2");
        }
        else {
            System.out.println(n+"is not power of 2");
        }
        }
        else{
            System.out.println("not a power of 2");
        }

    }
}