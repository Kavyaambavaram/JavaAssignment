package com.assignments;

import java.util.Scanner;

//	Harshad number  (number which is divisible by the sum of its digits)
public class Question_23 {
	public static void Harshad(int  num) {
		int sum=0;
		for(int i=1;i<=num;i++) { 
			sum += i;
		}
		if(sum%num==0) {
			System.out.println(num+" is a harshad number");
		}else {
			System.out.println(num+" is not a harshad number");
		}
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int num=sc.nextInt();
			Question_23.Harshad(num);

	}

}
