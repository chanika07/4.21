package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][]a = new int[r+1][c+1];
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (a[x][y]==0){
                System.out.println("reserved complete");
                a[x][y]=1;
            }
            else {
                System.out.println("reserved not complete");
            }
        }
    }
}
