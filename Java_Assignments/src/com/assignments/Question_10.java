package com.assignments;

import java.util.Scanner;

//the Sum of the Digits of a Number in Java Language

public class Question_10 {
		public static int sumOfDigit(int num) {
			int sum = 0;
			while (num > 0) {
				int rem = num % 10;
				num = num / 10;
				sum = sum + rem;
			}
			return sum;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = sc.nextInt();
			int sum = Question_10.sumOfDigit(num);
			System.out.println(sum);
		}
	}
