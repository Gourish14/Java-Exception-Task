package com.cozentus.exceptionTask;

import java.util.Scanner;

public class Q8 {
	public static int division(int num, int den) {
		if (den==0) {
			throw new ArithmeticException("Arithmetic Exception found");
		}
		else {
			return num/den;
		}
		
	}
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator : ");
		int num = sc.nextInt();
		System.out.println("Enter the denominator : ");
		int den = sc.nextInt();
		
		try {
			int division = division(num, den);
			System.out.println("Division Result : "+division);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
