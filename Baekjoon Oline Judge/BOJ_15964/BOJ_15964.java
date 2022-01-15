// 백준 15964번: 이상한 기호

import java.util.Scanner;

public class BOJ_15964 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long A = scanner.nextInt();
		long B = scanner.nextInt();
		
		long C = (A+B)*(A-B);
		
		if((1<=A && A<=100000) && (1<=B && B<=100000)) {
		System.out.println(C);
		}
	}
}
