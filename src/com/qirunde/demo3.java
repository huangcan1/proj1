package com.qirunde;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        long a,b=0,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("please input a number:");
        a=s.nextInt();
        System.out.println("请输入相加的项数：");
        int n=s.nextInt();
        int i=0;
        while (i<n){
            b=b+a;
            sum=sum+b;
            a=a*10;
            ++i;
        }
        System.out.println(sum);
    }
}
