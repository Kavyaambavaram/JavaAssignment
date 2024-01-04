package com.assignments;

import java.util.Scanner;

//Check Whether or Not the Year is a Leap Year in Java
//    year divisible bye 4 && year divisible bye 400  is leap yea
public class Question_7 {
	public static int leapYear(int year) {
		if(year%4==0 && year%400==0) {
			System.out.println(year+" is a leap year");
		}else {
			System.out.println(year+" is a not leap year");
		}
		return year;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year= sc.nextInt();
		System.out.println(Question_7.leapYear(year));

	}

}
