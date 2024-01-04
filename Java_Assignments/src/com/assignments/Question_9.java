package com.assignments;

import java.util.Scanner;
//	Find all the Prime Numbers in a Given Interval in Java
public class Question_9 {
		public static void prime(int start,int end) {
			for(int i=start;i<=end;i++) {
				if (prime(i)) {
	                System.out.println(i);
	            }
			}	
		}
		public static boolean prime(int num) { 
				for(int i=2;i<=num/2;i++){
				if(num%2==0) {	
					 return false;
				}
			}return true;
			
			}
		public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			System.out.println("enter starting range");
			int start=sc.nextInt();
			System.out.println("enter the ending range");
			int end=sc.nextInt();
			System.out.println("Prime numbers from "+start+" to "+end+" is :");
	        Question_9.prime(start, end);	

		}
}
