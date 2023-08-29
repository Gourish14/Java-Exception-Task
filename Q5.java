package com.cozentus.exceptionTask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q5 {
	public static String readFile(String filePath) throws FileNotFoundException, IOException {
        
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            return content.toString();
        } 
		catch (FileNotFoundException e) {
            throw e;
        }
    }
	public static void main(String[] args) {
        String filePath = "Gourish.txt";

        try {
            String fileContent = readFile(filePath);
            System.out.println("File content:\n" + fileContent);
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
	}
}
