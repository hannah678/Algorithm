import java.util.Scanner;

public class BOJ_3003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int kg = scanner.nextInt();
		int qn = scanner.nextInt();
		int lk = scanner.nextInt();
		int bp = scanner.nextInt();
		int kt = scanner.nextInt();
		int pn = scanner.nextInt();

		System.out.print(1-kg +" ");
		System.out.print(1-qn +" ");
		System.out.print(2-lk +" ");
		System.out.print(2-bp +" ");
		System.out.print(2-kt +" ");
		System.out.print(8-pn);
	}
}