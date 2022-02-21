import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 13702번: 이상한 술집
public class BOJ_13702_김혜영 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//key point: 제일 큰 막걸리 용량을 몇으로 나눌지
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		//배열 생성
		long[] arr = new long[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		insertSort(arr);//내림차순 정렬
		
		int num=0;	//마실 수 있는 총 인원
		long mak=0;	//나눈 막걸리 용량
		int i=1; 	//제일 큰 막걸리 용량을 나눌 인원
		
		while(num<K) {
			num=i;
			mak=arr[0]/i;
			for(int j=1; j<N; j++) {
				num += arr[j]/mak;
			}
			i++;
		}
		System.out.println(mak);	
	}
	
	//내림차순 정렬
	private static void insertSort(long[] array) {
		long temp = 0;
		int j = 0;
		for(int i=1; i<array.length; i++){
			temp = array[i];
			j = i;
			while(j > 0 && temp > array[j-1]){ 
				array[j] = array[j-1]; 
				j--; 
			}
			array[j] = temp;
		}
	}
}
