package chap01;

import java.util.Scanner;

public class SumQ7 {

	public static String sum(int n) {

		int sum = 0;
		String text = "";

		for (int i = 1; i <= n; i++) {

			sum += i;
			if (i == n) {
				text += i;
			} else {
				text += i + "+";
			}
		}

		text += " = " + sum;

		return text;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է����ּ���.");
		int n = sc.nextInt();

		System.out.println(sum(n));
	}

}
