package com.assignments;

import java.util.Scanner;

//Friendly pair(, the ratio between the sum of divisors of a number and the number itself.)
//      ==> get factors of a two numbers
//      ==>sum of the factprs is equal to number it self
//      ==> sum/num ==sum/num we get 1/1
//      ==> condition is true its a friendly pair
public class Question_25 { 
	public static int friendlyPair(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if (num % i == 0)
				sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=sc.nextInt();
		System.out.println("Enter the number");
		int n2=sc.nextInt();
		
		int sum1=friendlyPair(n1);
		int sum2=friendlyPair(n2);
		
		 if (sum1 / n1 == sum2 / n2)
		       System.out.println (n1 + " and " + n2 + " are friendly pairs");
		     else
		         System.out.println (n1 + " and " + n2 + " are not friendly pairs");

	}

}
