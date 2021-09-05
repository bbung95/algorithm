package chap01;
import java.util.Scanner;

public class Mid {
	
	// int
	public static int mid(int a, int b, int c) {

		int mid = a;

		if (a >= b) {
			if (a >= c) {
				if (c > b) {
					mid = b;
				} else {
					mid = c;
				}
			} else {
				mid = a;
			}
		} else if (a > c) {
			mid = a;
		} else if (b > c) {
			mid = c;
		} else {
			mid = b;
		}

		return mid;
	}
	
	// Array
	public static int mid(int[] arr) {

		int mid = arr[0];

		for(int i = 0; i < arr.length; i++) {
			
		}

		return mid;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		System.out.print("c : ");
		int c = sc.nextInt();

		System.out.println("mid : " + mid(a, b, c));
	}

}
