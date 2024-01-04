package com.assignments;

import java.util.Scanner;
                   //Greatest of the Three Numbers in Java
public class Question_6 {
	public static void isGreat(int a,int b, int c) {
		if(a>=b && a>=c) {
			System.out.println(a+" is grreatest number");
		}else if(b>=c && b>=a) {
			System.out.println(b+" is a greatest number");
		}else {
			System.out.println(c+" is a greatest number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a value");
		int a = sc.nextInt();
		System.out.println("Enter the b value");
		int b = sc.nextInt();
		System.out.println("Enter the c value");
		int c = sc.nextInt();
		Question_6.isGreat(a, b, c);
	}
}
