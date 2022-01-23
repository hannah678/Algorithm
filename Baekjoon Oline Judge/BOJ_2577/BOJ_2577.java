import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2577 {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int A = Integer.parseInt(br.readLine());
	int B = Integer.parseInt(br.readLine());
	int C = Integer.parseInt(br.readLine());

	
	if((100<=A&&A<1000)&&(100<=B&&B<1000)&&(100<=C&&C<1000)) {
		String D = Integer.toString(A*B*C);
		
		String[] str = D.split("");
		int[] arr= new int[10];
		
		for(int i=0; i<str.length; i++) { // String 배열을 int배열로 변환
		arr[i] = Integer.parseInt(str[i]);
		}
		
		int a =0;
		int b =0;
		int c =0;
		int d =0;
		int e =0;
		int f =0;
		int g =0;
		int x =0;
		int y =0;
		int z =0;
		
		for(int i=0; i<str.length; i++) {
			if(arr[i]==0) {
				a += 1;
			} else if(arr[i]==1) {
				b += 1;
			} else if(arr[i]==2) {
				c += 1;
			} else if(arr[i]==3) {
				d += 1;
			} else if(arr[i]==4) {
				e += 1;
			} else if(arr[i]==5) {
				f += 1;
			} else if(arr[i]==6) {
				g += 1;
			} else if(arr[i]==7) {
				x += 1;
			} else if(arr[i]==8) {
				y += 1;
			} else {
				z += 1;
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	}
}


