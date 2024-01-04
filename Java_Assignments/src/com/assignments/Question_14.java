package com.assignments;

import java.util.Scanner;
//Armstrong number in a given range 
public class Question_14 {
	
	public static void isArmstrong(int start, int end) {
		for (int num = start; num <= end; num++) {
            int temp = num;
            int sum = 0;
            while (temp != 0) {
                int r = temp % 10;
                sum = sum + (r * r * r);
                temp = temp / 10;
            }
            if (temp== num) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting range: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending range: ");
        int end = sc.nextInt();
        Question_14.isArmstrong(start, end);
    }
}
