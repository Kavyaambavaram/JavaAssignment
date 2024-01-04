package com.assignments;

import java.util.Scanner;

                          //	Check if a Number is Positive or Negative in Java

public class Question_1 {
	public static void isNum(int num) {
		if (num >= 0) {
			System.out.println(num + " is a Postive number");
		} else {
			System.out.println(num + " is a Negative number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();
		Question_1.isNum(num);

	}

}
