import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10871 {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s = br.readLine();
	StringTokenizer st = new StringTokenizer(s);
	
	
	int N = Integer.parseInt(st.nextToken());
	int X = Integer.parseInt(st.nextToken());
	
	String t = br.readLine();
	StringTokenizer T = new StringTokenizer(t);
	
	
	
	//배열 생성
	int[] A = new int[N]; //N
	
	if((1<=N&&N<=10000)&&(1<=X&&X<=10000)) {
		//배열에 정수 입력
		for(int i=0; i<A.length; i++) {
			A[i] =	Integer.parseInt(T.nextToken());
		}
	}
	
	//대소 비교
	for(int i=0; i<A.length; i++) {
		if(A[i]<X) {
			System.out.print(A[i]+" ");
		}
		
	}
	}
}
