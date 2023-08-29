package com.cozentus.exceptionTask;
import java.util.Scanner;
public class Q7 {
	public static String Password() throws SecurityException {
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password : ");
        String password = scanner.nextLine();

        if (WeakPassword(password)) {
            throw new SecurityException("Weak password");
        }

        return password;
    }

    public static boolean WeakPassword(String password) {
        return password.length() < 8;
    }
    
    public static void main(String[] args) {
        try {
            String password = Password();
            System.out.println("Password accepted: "+password);
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }
    }
}
