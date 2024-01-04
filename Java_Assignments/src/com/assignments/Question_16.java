package com.assignments;

import java.util.Scanner;

//Find the Nth Term of the Fibonacci Series
//  sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
public class Question_16 {
	public static int fibonacciNterm(int num) {
		int a = 0, b = 1, c;
        if (num == 0)
            return a;
        for (int i = 2; i <= num; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println(fibonacciNterm(num));

	}

}
