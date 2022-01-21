import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2920 {
	public static void main(String[] args) throws IOException {  // 예외처리
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
	String s = br.readLine();  // 문자열. Line단위로만 나눠짐.
	StringTokenizer st = new StringTokenizer(s); //입력된 int값들을 문자열로 변환
	
	int a = Integer.parseInt(st.nextToken()); 
	int b = Integer.parseInt(st.nextToken());
	int c = Integer.parseInt(st.nextToken());
	int d = Integer.parseInt(st.nextToken());
	int e = Integer.parseInt(st.nextToken());
	int f = Integer.parseInt(st.nextToken());
	int g = Integer.parseInt(st.nextToken());
	int h = Integer.parseInt(st.nextToken());
	
	s = s.trim(); //앞뒤 공백 제거
	
	if(s.equals("1 2 3 4 5 6 7 8")) {
		System.out.println("ascending");
	}  else if (s.equals("8 7 6 5 4 3 2 1")) {
		System.out.println("descending");
	} else {
		System.out.println("mixed");
	}
	}
}
