package com.project;
import java.util.*;
public class resultString {
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String n = sc.next();
    String m ="e";
    String result= "";
    for (int i =0;i<n.length();i++){
        if(n.substring(i,i+1).equals(m)){
            result = result + "i";

        }
else{
    result= result+n.charAt(i);
        }

    }
    System.out.println(result);
    String l = "shivam";
    System.out.println(l.substring(5,6));





}
}
