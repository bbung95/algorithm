package chap01;

public class MultiForQ13 {

	public static void main(String[] args) {

		// 9 X 9 덧셈식 (for for)
		System.out.println("  | 1  2  3  4  5  6  7  8  9");
		System.out.println("--+--------------------------");
		for (int i = 1; i <= 9; i++) {

			String str = i + " |";

			for (int j = 1; j <= 9; j++) {
				if (i + j < 10) {
					str += " ";
				}
				str += i + j + " ";
			}
			System.out.println(str);

		}
	}

}
