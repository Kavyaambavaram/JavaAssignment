package com.assignments;
                      //Greatest of the Two Numbers in Java

import java.util.Scanner;

public class Question_4 {
	public static void isGreat(int a, int b) {
		if(a>b) {
			System.out.println(a+" is a greatest number");
		}else{
			System.out.println(b+" is a greatest number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a value");
		int a = sc.nextInt();
		System.out.println("Enter the b value");
		int b = sc.nextInt();
		Question_4.isGreat(a,b);

	}

}
