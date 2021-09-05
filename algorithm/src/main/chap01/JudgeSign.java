package chap01;

import java.util.Scanner;

public class JudgeSign {
	
	public static void judge(int a) {
		
		if(a > 0) System.out.println("�����Դϴ�");
		else if(a < 0) System.out.println("�����Դϴ�");
		else System.out.println("0 �Դϴ�");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a : ");
		int a = sc.nextInt();
		
		judge(a);
	}

}
