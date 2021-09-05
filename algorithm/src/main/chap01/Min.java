package chap01;
import java.util.Scanner;

public class Min {
	
	public static int min(int a , int b , int c) {
		
		int min = a;
		
		if(min > b) min = b;
		if(min > c) min = c;
		
		return min;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		System.out.print("c : ");
		int c = sc.nextInt();
		
		System.out.println("min : "+min(a,b,c));
	}

}
