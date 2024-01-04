package com.assignments;

import java.util.Scanner;

//	Strong number 
public class Question_20 {
	
	static int factorial(int num)  // for returning the factorial of a digit
	   {
	     int fact = 1;
	     for (int i = 1; i <= num; i++)
	       fact = fact * i;
	     return fact;
	   }
	
	  public static boolean Strong(int num) //take the last digit and get that digit factoral stored in sum
	   {
	     int rem, sum = 0;
	     int temp = num;
	     boolean flag = false; //default is false 
	     while (temp>0)
	       {
	         rem = temp % 10;
	         sum = sum + factorial(rem);
	         temp /= 10;
	       }
	     if (sum == num)
	       flag = true;
	     return flag;
	   }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		if (Strong(num))
	         System.out.println (num + " is Strong Number");
	     else
	         System.out.println (num + " is not a Strong Number");
	   }
	}
