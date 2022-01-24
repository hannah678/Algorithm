import java.util.Scanner;
import java.util.StringTokenizer;

public class SWExpert_1204{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N=0;
		int[] arr = new int[1000];

		for(int i=1; i<=T; i++){ //case
			N = sc.nextInt();
			
			//점수 배열 생성
			for(int j=0; j<1000; j++) { 
				arr[j] = sc.nextInt();
			}
			
			//빈도 배열 생성
			int[] arr2 = new int[101]; // 0~100점
			
			for(int y=0; y<101; y++) {
				for(int x=0; x<1000; x++) {
					if(arr[x] == y){
						arr2[y]++;
					}
				}
			}
			
			//최빈수 구하기
			int maxN = arr2[0]; //빈도
			int max = 0;  // 점수
			
			for(int y=0; y<101; y++) {
				if(maxN <= arr2[y]) {
					maxN = arr2[y];
					max = y;
				}
			}
			System.out.println("#"+i+" "+max);
		}
	}
}
