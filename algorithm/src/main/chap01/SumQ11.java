package chap01;

import java.util.Scanner;

public class SumQ11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("양의 정수를 입력해주세요.");
			n = sc.nextInt();
		}while(n <= 0);
		
		String leng = Integer.toString(n);
		
		System.out.println(leng.length()+"자리 정수입니다.");
	}

}
