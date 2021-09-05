package chap01;

import java.util.Scanner;

public class SumQ9 {

	public static int sumof(int a, int b) {

		int sum = 0;
		
		int start = 0;
		int end = 0;
		
		if(a < b) {
			start = a;
			end = b;
		}else if(a > b) {
			start = b;
			end = a;
		}else {
			start = a;
			end = a;
		}
		
		for(int i = start; i <= end; i++) {
			
			sum += i;
		}
		
//		if (a < b) {
//			while (a <= b) {
//
//				sum += a;
//				a++;
//			}
//		} else if (a > b) {
//			while (a >= b) {
//
//				sum += b;
//				b++;
//			}
//		} else {
//			sum += a;
//		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("a : ");
		int a = sc.nextInt();
		System.out.println("b : ");
		int b = sc.nextInt();

		System.out.println(sumof(a, b));
	}

}
