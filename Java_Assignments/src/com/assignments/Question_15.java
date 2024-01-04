package com.assignments;

import java.util.Scanner;

//Fibonacci Series 
public class Question_15 {
	public static void fibonacci(int num) {
		int k=0,l=1,h=0;
		for(int i=0;i<num;i++) {
			
			System.out.print(k +" ");
			h=k+l;
			k=l;
			l=h;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Question_15 obj=new Question_15();
		obj.fibonacci(num);

	}

}
