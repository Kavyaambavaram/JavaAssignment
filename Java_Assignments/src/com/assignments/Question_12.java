package com.assignments;

import java.util.Scanner;

//the Palindrome number

public class Question_12 {
	int rem=0,rev =0;
	public void isPalindrome(int num) {
		int pn=num;
		while(num>0) {
			rem = num%10; 
			rev = rev*10+rem;
			num = num/10;
		}
		System.out.println(rev);
	if(pn==rev) {
		System.out.println(pn+" is a palindrome number");
	}else {
		System.out.println(pn+" is not a palindrome number");
	}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Question_12 op= new Question_12();
		op.isPalindrome(num);

	}

}
