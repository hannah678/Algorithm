public class BinarySearchTree {
	public static void main(String[] args) {
		 
        int[] arr = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; //오름차순 정렬된 배열
        Tree t = new Tree();
        t.makeTree(arr); 			//배열 입력
        t.searchBtree(t.root, 2); 	//검색할 데이터 입력
    }
}

//오름차순 배열기준 이진검색트리
class Tree {
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

    public void searchBtree(Node n, int find) {
    	if(find < n.data) {
    		searchBtree(n.left, find);
    	}else if(find > n.data) {
    		searchBtree(n.right, find);
    	} else {
    		System.out.println("Data found!");
    	}
    }
}
