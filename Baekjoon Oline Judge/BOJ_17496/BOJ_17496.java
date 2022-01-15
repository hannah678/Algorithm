// https://www.acmicpc.net/problem/17496

import java.util.Scanner;

public class BOJ_17496 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int T = scanner.nextInt();
		int C = scanner.nextInt();
		int P = scanner.nextInt();
		
		if((2<=N&&N<=90)&&(1<=T&&T<=N-1)&&(1<=C&&C<=300)&&(1<=P&&P<=1000)) {
			System.out.println((N-1) / T * C * P);
		} else {
			System.out.println("Input error");
		}
	}
}

// the number of starfruits = (N-1)/T*C 
// revenue = the number of starfruits * Price = (N-1)/T*C*P