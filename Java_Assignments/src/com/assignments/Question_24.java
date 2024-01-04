package com.assignments;

import java.util.Scanner;

//Abundant number  (If the sum of all its proper divisors, denoted by sum(n), is greater than the number's value)
public class Question_24 {
	public static void abundantNum(int num) {
		int sum=0;
		for (int i = 1; i < num; i++) {
			if (num%i == 0) {
			sum = sum + i;
			}
		}
			if (sum>num) {
			System.out.println(num + " abundant number");
			
			}
			else
			System.out.println(num + "  not  abundant number");
			}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int num=sc.nextInt();
			Question_24.abundantNum(num);

	}

}
