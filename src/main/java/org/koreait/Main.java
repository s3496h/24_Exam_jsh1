package org.koreait;

import java.util.Scanner;

 class fibonacci {
     public static int fibo (int n){
         if(n==0){
             return 0;
         }
         else if(n==1){
             return 1;
         }
         else {
             return fibo(n-1) + fibo(n-2);
         }
     }

     public static void main(String[] args) {
         fibonacci fib = new fibonacci();
         int a = 34;
         for(int i=1;i<=a;i++){
             System.out.println(fib.fibo(i));
         }

     }

}