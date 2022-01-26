package al02_search;


import java.util.Scanner;

//선형검색(linenarSearch, SequenceSearch)
//순차적으로 검색한다.

public class SequenceSearch {
	//for문을 이용하여 검색하기
	//key의 값이 있는 위치를 구하여 index를 반환하는 메소드
	//                     데이터 담긴 배열, 데이터 수
	static int linearSearch1(int[] data, int n, int key) {
		//배열에서 key값을 검색하여 index를 리턴한다.
		//만약 검색된 index가 없으면 -1을 리턴한다.
		for(int i = 0; i<n;i++) {
			if(data[i] == key) {
				return i;
		    }
		}
		return -1;
	}
	static int linearSearch2(int[] data, int n, int key) {
		int i = 0;
		
	while(true) {
		if( i == n)  // i, index ��ġ�� �����ϴ°�
			return -1;
		if(data[i] == key) // 
		    return i;
		i++; // ++i, i++, i = i+1, i+=1
	}	
}// while
		
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//데이터의 개수 입력: 배열을 생성
		System.out.print("데이터 수-> ");
		int n = sc.nextInt();
		
		//배열 생성
		int data[] = new int[n]; // 5  > 0 1 2 3 4
		
		//데이터 입력
		for(int i = 0 ; i<n ; i++) {
			System.out.print("data["+i+"] = ");
			data[i] = sc.nextInt();
		}
		
		// 찾을 숫자를 입력 받는다.
		System.out.print("검색할 데이터-> ");
		int key = sc.nextInt();
		
		//for를 이용한 선형검색 호출
		//key�� ���������� �ȿ� �־���ߵ�
		int idx = linearSearch1(data, n, key);
		if(idx >= 0) { // 검색한 데이터가 있을 때
			System.out.println(key+"는  data ["+idx+"]에 있습니다.");
		}else { //검색한 데이터가 없을 때
			System.out.println(key+"는 존자하지 않는 데이터입니다.");
		}
		
		//while���� �̿��� ���� �˻� ȣ�� 
		int idx2 = linearSearch2(data, n, key);
		if(idx2>=0) { // �˻����� �����Ѵ�
			System.out.println(key+"�� data ["+idx2+"] ��°�� �����մϴ�");
		}else { //�˻����� �������� �ʴ´�
			System.out.println(key+"�� �������� �ʴ� �������Դϴ�.");
		}

	}

}

