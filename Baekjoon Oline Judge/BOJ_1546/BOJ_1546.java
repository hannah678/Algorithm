import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546 {
	public static void main(String[] args) throws IOException {  // 예외처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		int n = Integer.parseInt(br.readLine()); //첫째줄 입력
		
		String s = br.readLine(); //둘째줄 입력
		StringTokenizer st = new StringTokenizer(s); //쪼개기
		
		int[] score = new int[n]; //배열 생성
		
		for(int i=0; i<score.length ; i++) {
		score[i] = Integer.parseInt(st.nextToken()); 
		}
		
		// sum, avg 구하기
		int sum=0; // 초기값
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		double avg = (double)sum/n;
		
		//max 구하기
		int max = score[0]; //초기값
		for(int i=0; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
		}
		System.out.println(avg / max * 100);
		}
	}
