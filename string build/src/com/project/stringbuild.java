package com.project;

public class stringbuild {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("shivam");
        str.append("s");
        System.out.println(str);
        //get car
        System.out.println(str.charAt(3));
        //substring
        String z = str.substring(0,4);
        System.out.println(z);
        //insert
        str.insert(3,"p");
        System.out.println(str);


    }
}
