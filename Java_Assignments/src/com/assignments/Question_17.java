package com.assignments;

import java.util.Scanner;

//Factorial of a number 

public class Question_17 {
	public static int factorial(int num){
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact = fact *i;
		}
		return fact;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Question_17 result = new Question_17();
        int fact = result.factorial(num);
        System.out.println("Factorial of " + num + " is: " + fact);
	}

}
