import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14487 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//입력
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String arr[] = s.split(" ");
		int mon[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			mon[i] = Integer.parseInt(arr[i]);
		}
		
		//제일 큰 수 찾기
		int max=0;
		for(int i=0; i<mon.length; i++) {
			if(mon[i] > max) {
				max=mon[i];
			}
		}
		
		//합 구하기
		int sum = 0;
		for(int i=0; i<mon.length; i++) {
			sum += mon[i];
		}
		
		//제일 큰 수를 제외하고 더하기(= 총합에서 제일 큰 수를 빼기)
		System.out.println(sum-max);
	}
}
