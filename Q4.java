package com.cozentus.exceptionTask;

public class Q4 {
	
	public static long recFact(int n) throws IllegalArgumentException {
		
		if (n < 0) {
        throw new IllegalArgumentException("Negative input not allowed");
		}
	
		if(n==0||n==1) {
			return 1;
		}
		else 
			return n*recFact(n-1);
		}
	
	public static void main(String[] args) {
		int n = -5;
        try {
            int factorial = (int) recFact(n);
            System.out.println("Factorial is : " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
	}
}
