package com.assignments;

import java.util.Scanner;

//	Find the Sum of the Numbers in a Given Interval in Java
public class Question_5 {
	public static int sumofIntervals(int s,int e) {
		int sum =0;
		for(int i=s;i<=e;i++) {
			sum =sum +i;
		}
		return sum;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range s is:");
		int s= sc.nextInt();
		System.out.println("Enter the ending range e is:");
		int e= sc.nextInt();
		System.out.println(Question_5.sumofIntervals(s, e));

	}

}
