package com.assignments;

import java.util.Scanner;

//	Perfect number 
public class Question_21 {
	public static void perfectNum(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) { 
//				System.out.println(i);
				  sum=sum+i;
			}
		}if(sum==num) {
				System.out.println(num+" is a perfect number");
			}else {
				System.out.println(num+" is not a perfect number");
			}
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Question_21.perfectNum(num);

	}

}
