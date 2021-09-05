package chap01;

import java.util.Scanner;

public class Sum01 {
	
	// while
	public static int sumWhile(int n) {

		int sum = 0;
		int i = 1;

		while (i <= n) {
			sum += i;
			i++;
		}

		return sum;
	}
	
	//for
	public static int sumFor(int n) {

		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}

		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���.");
		int n = sc.nextInt();
		
		System.out.println("while : " + sumWhile(n));
		System.out.println("for : " + sumFor(n));
	}

}
