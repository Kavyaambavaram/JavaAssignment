package com.assignments;

import java.util.Scanner;

//Write a program to check if a given number is prime or not in java
public class Question_8 {
	public static void isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%2==0) {
				System.out.println(num+" is a not prime number");
				break;
			}else {
				System.out.println(num+" is a prime number");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		Question_8.isPrime(num);

	}

}
