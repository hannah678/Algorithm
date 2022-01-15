import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_1271 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger n = scanner.nextBigInteger();
		BigInteger m = scanner.nextBigInteger();
		
			BigInteger divide = n.divide(m);
			BigInteger mod = n.mod(m);

			System.out.println(divide);
			System.out.println(mod);
	}
}

