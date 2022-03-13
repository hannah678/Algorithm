import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 2110번: 공유기 설치
public class BOJ_2110_공유기설치 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		//배열 생성
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr); //오름차순 정렬
		
		//이상적 공유기 번호
		int[] searchNum = new int[C];
		
		int numLength = arr[N-1] - arr[0];  //집의 최대거리
		
		for(int i=0; i<C; i++) {
			searchNum[i] = arr[0] + Math.round(numLength/(C-1)*i);
		} 
		//System.out.println(Arrays.toString(searchNum));
		
		//실제 공유기 번호
		ArrayList<Integer> realNum = new ArrayList<>();
		
		//이진검색트리 생성
		T t = new T();
		t.makeTree(arr);
		for(int i=0; i<C; i++) {
			t.searchBtree(t.root, searchNum[i], realNum);
		}
		
		//공유기 사이의 거리
		int answer[] = new int[C-1];
		for(int i=0; i<C; i++) {
		answer[i] = realNum.get(i+1) - realNum.get(i);
		}
		Arrays.sort(answer);
		System.out.println(answer[0]);
	}
}
//오름차순 배열기준 이진검색트리
class T {
	 Node root;
 
  static class Node {
      int data;
      Node left;
      Node right;

      public Node(int data) {
          this.data = data;
      }
  }//Node
  
  public void makeTree(int[] arr) {
	        root = makeTree(arr, 0, arr.length - 1); //return된 중간노드를 루트로 설정
	}
  
  public Node makeTree(int[] arr, int start, int end) {
  	
      if (start > end) return null;				//재귀호출 종료 설정

      int mid = (start + end) / 2;  				//중간지점 설정
      Node node = new Node(arr[mid]);
      node.left = makeTree(arr, start, mid - 1); 	//왼쪽부분 재귀호출
      node.right = makeTree(arr, mid + 1, end); 	//오른쪽부분 재귀호출
      return node;
  }

  public void searchBtree(Node n, int find, ArrayList<Integer> realNum) {
	  int plus = find;
		int minus = find;
  	if(find < n.data) {
  		if(n.left==null) {//찾는 데이터가 없다면
  			while(true) {
  	  			searchBtree(root, plus++, realNum); //(?)반올림문제 해결하기
  	  			searchBtree(root, minus--, realNum);
  			}
  		}else {
  		searchBtree(n.left, find, realNum);
  		}
  	}else if(find > n.data) {
  		if(n.right==null) {//찾는 데이터가 없다면
  			while(true) {
  	  			searchBtree(root, plus++, realNum); //(?)반올림문제 해결하기
  	  			searchBtree(root, minus--, realNum);
  			}
  		}else {
  		searchBtree(n.right, find, realNum);
  		}
  	} else{
  		realNum.add(find);
  		return; //메소드 종료
  	}
  }
}