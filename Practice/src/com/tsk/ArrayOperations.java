package com.tsk;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperations {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter array size: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        for (int i = 0, j = n - 1; i < j; i++, j--) {
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	        int min = arr[0], max = arr[0];
	        for (int num : arr) {
	            if (num < min) min = num;
	            if (num > max) max = num;
	        }
	        System.out.println("Reversed Array: " + Arrays.toString(arr));
	        System.out.println("Min: " + min + ", Max: " + max);
	        
	        sc.close();
	    }
	}