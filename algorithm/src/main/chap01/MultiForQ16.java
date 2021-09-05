package chap01;

import java.util.Scanner;

public class MultiForQ16 {
	
	public static void sprira(int n) {
		
		for(int i = 1; i <= n ; i++	) {
			for(int j = n; i < j ; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i+((i-1)) ; k++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("정수를 입력해주세요 : ");
			n = sc.nextInt();
			
		}while(n <= 0);
		
		sprira(n);
	}

}
