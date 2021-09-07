package chap02;

import java.util.Random;

public class MaxArrayRandQ01 {
	
	public static int maxOf() {
		
		Random rd = new Random();
		
		int n = rd.nextInt(10)+1;
		int[] arr = new int[n]; 

		for(int i = 0; i < n; i++) {
			
			arr[i] = 100 + rd.nextInt(90);
		}
		
		int max = arr[0];
		for(int i = 0; i < arr.length-1; i++) {
			
			if(max < arr[i+1]) {
				max = arr[i+1];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		System.out.println(maxOf());
	}

}
