package com.assignments;

import java.util.Scanner;
//	Perfect Square 
public class Question_22 {
	   public static boolean perfectSqr(int num) {
		   for (int i = 1; i * i <= num; i++) {
	            if (i * i == num) {
	                return true;
	            }
	        }
	        return false;
	    }
   
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
       if (perfectSqr(num)) {
           System.out.println(num + " is a perfect square.");
       } else {
           System.out.println(num + " is not a perfect square.");
       }
}
}
