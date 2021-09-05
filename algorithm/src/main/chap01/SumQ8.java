package chap01;

import java.util.Scanner;

public class SumQ8 {
	
	public static int sum(int n) {
		
		int sum = 0;
		
		for(int i = 1; i<= n/2; i++) {
			
			sum += (i+(n-i+1));
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(sum(n));
	}

}
