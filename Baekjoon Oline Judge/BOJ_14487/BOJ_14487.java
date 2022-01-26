import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14487 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�Է�
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String arr[] = s.split(" ");
		int mon[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			mon[i] = Integer.parseInt(arr[i]);
		}
		
		//���� ū �� ã��
		int max=0;
		for(int i=0; i<mon.length; i++) {
			if(mon[i] > max) {
				max=mon[i];
			}
		}
		
		//�� ���ϱ�
		int sum = 0;
		for(int i=0; i<mon.length; i++) {
			sum += mon[i];
		}
		
		//���� ū ���� �����ϰ� ���ϱ�(= ���տ��� ���� ū ���� ����)
		System.out.println(sum-max);
	}
}
