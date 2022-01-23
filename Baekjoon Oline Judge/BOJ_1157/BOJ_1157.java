import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

public class BOJ_1157 {
	public static void main(String[] args) throws IOException {  // 예외처리
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
	String s = br.readLine();  // 문자열. Line단위로만 나눠짐.
	StringTokenizer st = new StringTokenizer(s); //입력된 int값들을 문자열로 변환
	
	int a = Integer.parseInt(st.nextToken()); 


	}
}