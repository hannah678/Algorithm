import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546 {
	public static void main(String[] args) throws IOException {  // ����ó��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //����
		//ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. 
		//��° �ٿ� �������� ���� ������ �־�����. �� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.
		int n = Integer.parseInt(br.readLine()); 
		
		String s = br.readLine(); //�Է�
		StringTokenizer st = new StringTokenizer(s); //�ɰ���
		
		int[] score = new int[n]; //�迭 ����
		
		for(int i=0; i<score.length ; i++) {
		score[i] = Integer.parseInt(st.nextToken()); 
		}
		
		// sum, avg ���ϱ�
		int sum=0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		int avg = sum/n;
		
		//max ���ϱ�
		int max = 1;
		for(int i=0; i<score.length-1; i++) {
			for(int j=1; j<score.length-i-1; j++) {
			if(score[i] >= score[i+j]) {
				max = score[i];
			}
			}
		}
		
		System.out.println(avg / max * 100);
	}

}
