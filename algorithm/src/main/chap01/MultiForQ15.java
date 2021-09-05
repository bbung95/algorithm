package chap01;

import java.util.Scanner;

public class MultiForQ15 {

	// 왼쪽아래가 직각인 이등변 삼각형
	public static void triangleLB(int n) {

		System.out.println("왼쪽 아래가 직각인 이등변 삼각형");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	// 왼쪽위가 직각인 이등변 삼각형
	public static void triangleLU(int n) {

		System.out.println("왼쪽 위가 직각인 이등변 삼각형");
		for (int i = 1; i <= n; i++) {
			for (int j = n; i <= j; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

	}

	// 오른쪽 위가 직각인 이등변 삼각형
	public static void triangleRU(int n) {

		System.out.println("오른쪽 위가 직각인 이등변 삼각형");
		for (int i = 1; i <= n; i++) {

			for (int k = 0; k < i - 1; k++) {
				System.out.print(" ");
			}
			for (int j = n; i <= j; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	// 오른쪽 아래가 직각인 이등변 삼각형
	public static void triangleRB(int n) {

		System.out.println("오른쪽 아래가 직각인 이등변 삼각형");
		for (int i = 1; i <= n; i++) {

			for (int k = 1; k <= n-i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.print("양의 정수를 입력해주세요 : ");
			n = sc.nextInt();

		} while (n <= 0);

		triangleLB(n);
		triangleLU(n);
		triangleRU(n);
		triangleRB(n);
	}

}
