
import java.util.Scanner;

public class BOJ_5554 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		int sum = a+b+c+d;
		
		if(60 <= sum && sum < 3600) {
			System.out.println(sum/60);
			System.out.println(sum%60);
		}
	}
}
