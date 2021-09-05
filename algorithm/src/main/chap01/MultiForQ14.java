package chap01;

import java.util.Scanner;

public class MultiForQ14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변의 길이를 입력해주세요 : ");     
		int n = sc.nextInt();
		
		System.out.println("사각형의 단수를 출력합니다.");
		System.out.println("단 수 : "+n   );
		for(int i = 1; i <= n ; i++) {
			
			String str = "";
			for(int j = 1; j <= n ; j++) { 
				str += "*";
			}
			System.out.println(str);
		}
	}

}
