import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int five=0;
		int three=0;
	
		for(int a=0; a<=1000; a++) {
			for(int b=0; b<=1666; b++){
				if(5*a+3*b==n) {
					five = a;
					three = b;
				}
			}
		} // a�� for���� �ٱ��� �����Ƿ� �Լ���� �� a�� �ִ��� ���� ���������� �����.
		
		if(five+three !=0) {
			System.out.println(five+three);
		} else {
			System.out.println(-1);
		}
	}
}	
