package com.assignments;

import java.util.Scanner;

//Armstrong number
public class Question_13 {
	public static void armstrongNum(int num) {
		int temp=num;
		int rem=0,sum=0;
		while(num!=0) {
			rem = num%10;
			sum = sum + (rem*rem*rem);
			num = num/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is a armstrong number");
		}else {
			System.out.println(temp+" is not a armstrong number");
		}	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Question_13.armstrongNum(num);
	}

}
