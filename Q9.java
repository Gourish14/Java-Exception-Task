package com.cozentus.exceptionTask;
import java.util.Scanner;
public class Q9 {
	
	public static double SquareRoot(double num) throws ArithmeticException {
        if (num < 0) {
            throw new ArithmeticException("Error 404 Found");
        }
        return num*num;
    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number : ");
            double number = scanner.nextDouble();
            double result = SquareRoot(number);
            System.out.println("Square root : "+ result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
