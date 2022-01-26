package al02_sort;

import java.util.Arrays;
import java.util.Random;

public class ArrayBubbleSort {
	
	public static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//버블정렬: 오름차순(작은 수를 맨 앞으로 보내기)
	public static void mySort(int a[], int n) {
		for(int i=0; i<n-1; i++) {
			for(int j=n-1; j>0; j--) {  //j=9
				// a[8]     a[9]
				if(a[j-1] > a[j]) {
					//교환
					//       8   9
					swap(a, j-1, j);
				}
			}
		System.out.println((i+1)+"번 정렬: " + Arrays.toString(a));
		}
	}
	public static void main(String[] args) {
		Random ran = new Random();
		//데이터 준비
		//1~100까지의 난수를 생성하여 크기순으로 정렬(오름차순)
		
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(100)+1;  //0~99+1 = 1~100
		}
		System.out.println("정렬 전: "+Arrays.toString(arr));
		
		mySort(arr, arr.length);
		System.out.println("정렬 후: " + Arrays.toString(arr));
	}

}
