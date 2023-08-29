package com.cozentus.exceptionTask;
import java.util.Scanner;
public class Q6 {
	
	public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter an integer: ");
            String userInput = scanner.nextLine();

            try {
                inputNumber = Integer.parseInt(userInput);
                validInput = true;
            } 
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer");
            }
        }
        return inputNumber;
    }
	
	public static void main(String[] args) {
        int number = readInteger();
        System.out.println("You entered : "+number);
    }
}
