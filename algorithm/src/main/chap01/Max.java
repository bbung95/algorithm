package chap01;

import java.util.Scanner;

public class Max {
	
	// int
	public static int max(int a , int b , int c) {
		
		int max = a;
		
		if(max < b) max = b;
		if(max < c) max = c;
		
		return max;
	}
	
	// Array ����
	public static int max(int[] arr) {
		
		int max = arr[0];
		
		for(int i : arr) {
			if(max < i) max = i;
		}
		
		
		return max;
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a : ");
		int a = sc.nextInt();
		
		System.out.println("b : ");
		int b = sc.nextInt();
		
		System.out.println("c : ");
		int c = sc.nextInt();
		
		
		 System.out.println("int : "+max(a,b,c));		 
		 
		
		int[] arr = {2,7,6,9,21,3};
		
		System.out.println("Array : "+max(arr));
		
	}

}
