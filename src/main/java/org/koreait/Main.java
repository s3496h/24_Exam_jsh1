package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print("a");
            }
            for (int j = 1; j <= (i*2)-1; j++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
}