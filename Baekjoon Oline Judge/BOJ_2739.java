import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2739 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if (1<=N && N<=9) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d * %d = "+N*i, N, i);
				System.out.println();
			}
		}
	}
}
