package com.cozentus.exceptionTask;
import java.util.Scanner;
public class Q1 {
	
	public static int Maximum(int arr[]) throws NullPointerException{
		if (arr == null || arr.length == 0) {
            throw new NullPointerException("Array is empty");
        }

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
		
	public static void main(String [] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of the array : ");
		 int n = sc.nextInt();
		 
		 System.out.println("Enter the elements of array : ");
		 int arr[] = new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 try {
	            int maxValue = Maximum(arr);
	            System.out.println("Maximum value : " + maxValue);
	        } 
		 catch (NullPointerException e) {
	            System.out.println("Array elements are not present");
	        }
	}
}
