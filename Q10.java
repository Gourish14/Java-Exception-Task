package com.cozentus.exceptionTask;
import java.util.Scanner;
public class Q10 {
	
	public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Illegal Age");
        }
    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age : ");
            int age = scanner.nextInt();
            validateAge(age);
            System.out.println(age);
        } 
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    
}
