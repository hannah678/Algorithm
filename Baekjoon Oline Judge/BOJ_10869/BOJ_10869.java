// 백준 10869번: 사칙연산

import java.util.Scanner;

public class BOJ_10869 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		if((1<=A && A<=10000)&&(1<=B && B <=10000)) {
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		}
	}
}
