package com.assignments;

import java.util.Scanner;

                    //Whether a Number is Even or Odd in Java

public class Question_2 {
	public static void isNum(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is a even number");
		} else {
			System.out.println(num + " is a odd number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();
		Question_2.isNum(num);
	}

}
