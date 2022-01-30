import java.util.Arrays;

public class QuickSort {
	private static void swap(int i1, int i2) {
		int temp = i1;
		i1=i2;
		i2=temp;
	}
	
	private static void myQuick(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int pivot = a[(pl+pr)/2];
		
		do {
			while(a[pl]<pivot) pl++;
			while(a[pr]<pivot) pr--;
			if(pl<=pr) {
				swap(pl, pr);
			}

		}while(pl<=pr);
		
		if(left<pr) {
			myQuick(a, left, pr);
		}
		
		if(pl<right) {
			myQuick(a, pl, right);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		int[] arr = {6, 5, 2, 4, 9, 1, 3, 0, 8, 7};
		System.out.println("정렬 전: "+Arrays.toString(arr));
		myQuick(arr, 0, arr.length-1);
		System.out.println("정렬 후: "+Arrays.toString(arr));
	}

}
