package al02_search;

import java.util.Scanner;

public class BinarySearch {
	// 이진 검색
	// 데이터가 정렬되있어야 함
	// 가운데 위치를 구하여 검색
	// static 쓰는 이유는 binary(arr,n,key)이런식으로 쓰기위함. 안쓰면 객체생성해서 써야됨
    static int binarySearch(int arr[], int n, int key ) { // 
    	int left = 0;
    	int right = n-1;
    	
    	do {
    		// 중간 인덱스를 구한다.
    	int center= (left+right)/2;
    	//검색할 값이 중간 index에 있을경우
    	if(key == center) {
    		return center;
    	}else if(arr[center] < key) {// 찾고자 하는 값이 중앙값보다 크면
    		//왼쪽 시작점을 center+1로 바꾼다
    		left = center+1;
    	}else {// 찾고자 하는 값이 중앙값보다 작으면
    		right = center -1;
    	}
    	}while(left<=right);
    	//검색한 값이 없을경우
    	return -1;

    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("데이터 수 :");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n;i++) {
			System.out.print("arr["+i+"] :");
			arr[i] = sc.nextInt();
		}
		
		// 검색할 수 입력
		System.out.println("검색할 데이터 :");
		int key = sc.nextInt();
		
		//이진 검색
		int result = binarySearch(arr, n, key);
		if(result >= 0) {
			System.out.println(key+"는["+result+"]위치에 존재");
		}else {
			System.out.println(key+"는 존재하지 않는 데이터");
		}

	}

}
