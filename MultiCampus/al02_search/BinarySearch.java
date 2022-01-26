package al02_search;

import java.util.Scanner;

public class BinarySearch {
	// ���� �˻�
	// �����Ͱ� ���ĵ��־�� ��
	// ��� ��ġ�� ���Ͽ� �˻�
	// static ���� ������ binary(arr,n,key)�̷������� ��������. �Ⱦ��� ��ü�����ؼ� ��ߵ�
    static int binarySearch(int arr[], int n, int key ) { // 
    	int left = 0;
    	int right = n-1;
    	
    	do {
    		// �߰� �ε����� ���Ѵ�.
    	int center= (left+right)/2;
    	//�˻��� ���� �߰� index�� �������
    	if(key == center) {
    		return center;
    	}else if(arr[center] < key) {// ã���� �ϴ� ���� �߾Ӱ����� ũ��
    		//���� �������� center+1�� �ٲ۴�
    		left = center+1;
    	}else {// ã���� �ϴ� ���� �߾Ӱ����� ������
    		right = center -1;
    	}
    	}while(left<=right);
    	//�˻��� ���� �������
    	return -1;

    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �� :");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n;i++) {
			System.out.print("arr["+i+"] :");
			arr[i] = sc.nextInt();
		}
		
		// �˻��� �� �Է�
		System.out.println("�˻��� ������ :");
		int key = sc.nextInt();
		
		//���� �˻�
		int result = binarySearch(arr, n, key);
		if(result >= 0) {
			System.out.println(key+"��["+result+"]��ġ�� ����");
		}else {
			System.out.println(key+"�� �������� �ʴ� ������");
		}

	}

}
