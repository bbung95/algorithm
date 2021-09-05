package chap01;

import java.util.Scanner;

public class SumQ10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// while 문
//		boolean active = true;
//		
//		
//		while(active) {
//			System.out.println("b을 입력해주세요");
//			int b = sc.nextInt();
//			
//			System.out.println("a을 입력해주세요");
//			int a = sc.nextInt();
//			
//			if(b <= a) {
//				System.out.println("a가 b보다 큽니다.");
//				
//			}else {
//				active = false;
//				System.out.println("b - a 는 "+(b-a));
//			}
//		}
		
		
		while(true) {
			System.out.println("b을 입력해주세요");
			int b = sc.nextInt();
			
			System.out.println("a을 입력해주세요");
			int a = sc.nextInt();
			
			if(b <= a) {
				System.out.println("a가 b보다 큽니다.");
				
			}else {
				System.out.println("b - a 는 "+(b-a));
				//break;
				return;
			}
		}
		
		// do-while 문
		
//		int a, b;
//		
//		do {
//		System.out.println("b을 입력해주세요");
//		b = sc.nextInt();
//		
//		System.out.println("a을 입력해주세요");
//		a = sc.nextInt();
//		
//		}while(b <= a);
//		
//		System.out.println("b - a 는 "+(b-a));
		
	}

}
