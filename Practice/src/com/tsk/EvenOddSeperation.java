package com.tsk;
import java.util.Arrays;
import java.util.Scanner;
public class EvenOddSeperation {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter array size: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int[] result = new int[n];
	        int left = 0, right = n - 1;
	        for (int num : arr) {
	            if (num % 2 == 0) {
	                result[left++] = num;
	            } else {
	                result[right--] = num;
	            }
	        }
	        System.out.println("Separated Array: " + Arrays.toString(result));
	        sc.close();
	    }
	}