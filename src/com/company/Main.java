package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int m=0,a=0,b=0;

        Scanner scan=new Scanner(System.in);
        m=scan.nextInt();

        while(m>0) {
            a = scan.nextInt();
            b = scan.nextInt();

            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else if (b > a) {
                    b = b - a;
                }
            }
                if (a == b) {
                    System.out.println(a + b);
            }

            m--;
        }

    }
}
