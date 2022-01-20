import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546 {
	public static void main(String[] args) throws IOException {  // 예외처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		//첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 
		//둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
		int n = Integer.parseInt(br.readLine()); 
		
		String s = br.readLine(); //입력
		StringTokenizer st = new StringTokenizer(s); //쪼개기
		
		int[] score = new int[n]; //배열 생성
		
		for(int i=0; i<score.length ; i++) {
		score[i] = Integer.parseInt(st.nextToken()); 
		}
		
		// sum, avg 구하기
		int sum=0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		int avg = sum/n;
		
		//max 구하기
		int max = 1;
		for(int i=0; i<score.length-1; i++) {
			for(int j=1; j<score.length-i-1; j++) {
			if(score[i] >= score[i+j]) {
				max = score[i];
			}
			}
		}
		
		System.out.println(avg / max * 100);
	}

}
