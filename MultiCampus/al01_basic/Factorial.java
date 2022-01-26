package al01_basic;

import java.util.Scanner;

public class Factorial {
	//1.for문을 통한 팩토리얼 구현
	static int factorial1(int max) {
        int result = 1;
        for(int i=max;i>=1;i--) {
            result *= i; 
        }
        return result;
	}
	
	//2.반환데이터가 없는 재귀함수
	static int result;
	public static void factorial2(int max) {
		if(max<=1) return;
		result *= max;
		factorial2(max-1);
	}
	
	//3.반환데이터(팩토리얼을 구한 결과값)가 있는 재귀함수
	public static int factorial3(int max) {
		if(max<=1) return 1;
		return max*factorial3(max-1);
	}
	
	//4.while문 통한 팩토리얼 구하기
	public static int factorial4(int max) {
		int r =1;
		while(true) {
			if (max<=1) return r;
			r*=max;
			max--;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//입력한 수 까지 팩토리얼 구하기
		int max = s.nextInt();
		
		//1.for문을 통한 팩토리얼 구현
		int res1 = factorial1(max);
		System.out.println("f1->"+res1);
		
		//2.반환데이터가 없는 재귀함수
		result =1;
		factorial2(max);
		System.out.println("f2->"+result);
		
		//3.반환데이터(팩토리얼을 구한 결과값)가 있는 재귀함수
		int r = factorial3(max);
		System.out.println("f3->"+r);
		
		//4.while문 통한 팩토리얼 구하기
		int answer = factorial4(max);
		System.out.println("f4->"+answer);
		
		s.close();
	}
}