package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String tex = sc.nextLine();
        for (int i=0;i<tex.length();i+=5){
            if (i+5>tex.length()) {

                System.out.println(tex.substring(i, tex.length()));
            }
            else{
                System.out.println(tex.substring(i,i+5));
            }
            int c=0;
            for (int j=0 ;j<tex.length();j++){

                if (tex.charAt(j)==97 ||tex.charAt(j)==101 ||
                        tex.charAt(j)==105 ||
                        tex.charAt(j)==111 ||tex.charAt(j)==117 ){
                    c++;
                }
            }System.out.println(" "+c);
        }


    }
}
