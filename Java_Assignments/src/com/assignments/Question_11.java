package com.assignments;

import java.util.Scanner;

//Reverse of a number
public class Question_11 {
	public static int reverseNum(int num) {
		int rem=0;
		int reverse=0;
		while(num>0) {
				rem = num%10; // to read the last digit
				reverse = reverse*10+rem; //to store value
				num = num/10; // and remove the last digit
			}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(Question_11.reverseNum(num));

	}

}
