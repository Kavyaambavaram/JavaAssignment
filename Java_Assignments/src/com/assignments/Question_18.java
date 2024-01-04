package com.assignments;

import java.util.Scanner;

//Power of a number
public class Question_18 {
	public static void main(String[] args) {
		int var =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base number");
		int base=sc.nextInt();
		System.out.println("Enter the exponent number");
		int expo=sc.nextInt();
		
		for(int i=0;i<expo;i++) {
			var = var * base;
		}	System.out.println(base+" raised to the power of "+expo+" is "+var);
	}

}
