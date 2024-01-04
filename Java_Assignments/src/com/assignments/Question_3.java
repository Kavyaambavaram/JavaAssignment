package com.assignments;
                               
                                              //Sum of First N Natural Numbers in Java

import java.util.Scanner;

public class Question_3 {
	int sum= 0;
	public void showData(int n) {
		for(int i=1;i<=n;i++) { 
			sum = sum+i;
		}
		System.out.println("Sum of first "+n+" natural numbers is:" +sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		Question_3 s= new Question_3();
		s.showData(n);
	}

}

