package com.project;
import java.util.*;
public class strings {
    public static void main(String[] args){
//learning strings
        //definig a string
        String name="toony";
        String sur ="stark";
       //
        // adding two strings
        String fullname = name+" "+sur;
        System.out.println(fullname);
//printing length of a string
        System.out.println(fullname.length());
//using chaar at
        System.out.println(fullname.charAt(10));
        ///comparing strings
        //equal string
        if(name.equals(sur)){
            System.out.println("Strings are equal");

        }
        else {
            System.out.println("Strings are not equal");
        }
//comparing if greater gives +;small gives -; and equal gives zero;
        //not use"=="  for comparing strings as many times it gives wrong answers as strings are stored in different wsaty in memoery
        if (name == sur){
            System.out.println("Strings are equal");
        }
        //printing part substring means printing part of string
        System.out.println(fullname.substring(0,1));
//converting str to int and int to string
        //whever we want to perform methamelical operation on the string having nos in can be converted into int using
//Integer.parseInt(string_name);
//also
    String str= "1234";
    int n =1234;
    int m =Integer.parseInt(str);
    System.out.println(m);
System.out.println(m+n);
String ny =Integer.toString(n);
System.out.println(ny);
//java string is immutable


        n =0;
        System.out.print(""+n);



    }
}
