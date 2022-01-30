package al05_binary_tree_search;

public class BinaryTree<K, V> {
	//객체 1개를 저장할 노드클래스
	//				key, Data
	static class Node<K, V>{
		private K key;//key
		private V data;//data
		private Node<K,V> left;//왼쪽노드
		private Node<K,V> right;//오른쪽노드
		
		Node(K key, V data, Node<K,V> left, Node<K,V> right) {
			this.key=key;//멤버에 있는 key는 지역변수에 있는 key에 대입해
			this.data=data;//멤버에 있는 data는 지역변수에 있는 data에 대입해
			this.left=left;//멤버에 있는 left는 지역변수에 있는 left에 대입해
			this.right=right;//멤버에 있는 right는 지역변수에 있는 right에 대입해
		}
		K getKey() {
			return key;
		}
		//데이터
		V getValue() {
			return data;
		}
		//출력
		void print() {
			System.out.println(data);
		}
		
	}//Node
	
	private Node<K,V> root;//루트노드
	
	BinaryTree(){
		root = null;//루트노드초기화
	}
	
	public int comp(K key1, K key2) {
		//		key1-key2	  0 : key1과 key2같다.	결과값이 양수면 key1이 더 크다, 결과값이 음수면 key2이 더 크다. 
		return ((Comparable<K>)key1).compareTo(key2);
	}
	//노드추가(위치를 찾아서 노드추가)
	public void addNode(Node<K,V> node, K key, V data) {
		//비교
		int result = comp(key, node.getKey());
		if(result==0) {//이미 있는 키값일때(key=node.getKey())
			return;
		} else if(result<0) {//(key가 더 작다)왼쪽노드를 검색
			if(node.left==null) {//node의 왼쪽이 비어있으면
				node.left = new Node<K,V>(key,data,null,null);   //(key, data, left, right)
			}else {
				addNode(node.left, key, data);
			}
		} else {//양수:(key가 더 크다)오른쪽 노드를 검색
			if(node.right==null) {
				node.right = new Node<K,V>(key,data,null,null);
			}else {
				addNode(node.right, key, data);
			}
		}
	}
	
	//노드추가
	public void add(K key, V data) {
		if(root==null) {
			//루트가 비어있으면 data를 노드를 만들어 root에 대입하면 된다.
			root = new Node<K,V>(key, data, null, null);
		} else {
			//루트가 비어있지 않으면 key를 이용하여 위치를 찾아서 추가해야한다.
			addNode(root, key, data);
		}
	}
	//노드삭제
	public boolean remove(K key) {
		Node<K, V> point = root;//root
		Node<K, V> parent = null;//부모 (root는 부모가 없으므로 선언만 해두고 null값 초기화)
		boolean isLeftChild = true;//왼쪽, 오른쪽노드인지의 정보가 필요함
		
		while(true) {
			if(point==null){//point가 null이면 노드가 존재하지 않는다.
				return false;
			}
			
			//삭제할 노드 찾기
			int cond = comp(key, point.getKey());//양수 -> 오른쪽검색
			
			if(cond==0) {//검색할 노드 찾음.
				break;
			}else {
				parent = point;//부모노드
				if(cond<0) {
					point = point.left;//다음노드(왼쪽의 다음노드)
					isLeftChild = true;
				}else {
					point = point.right;
					isLeftChild = false;
				}
			}
		}
		//부모노드 , 삭제할노드 정해짐
		if(point.left == null) {
			if(point==root) {
				root = point.right;
			}else if(isLeftChild) {
				parent.left = point.right;
			}else {
				parent.right = point.right;
				
			}
		}else if(point.right==null) {
			if(point==root) {
				root = point.left;
			}else if(isLeftChild) {
				parent.left = point.left;
			}else {
				parent.right = point.right;
			}
		}else {
			parent = point;
			Node<K,V> maxNode = point.left;
			isLeftChild = true;
			while(maxNode.right!=null) {
				parent = maxNode;
				maxNode = maxNode.right;
				isLeftChild = false;
			}
			
			point.key = maxNode.key;
			point.data = maxNode.data;
			
			if(isLeftChild) {
				parent.left = maxNode.left;
			}else {
				parent.right = maxNode.left;
			}
		}

		System.out.println(key + "번 회원의 정보가 삭제되었습니다.");
		return true;

	public V search(K key) {
		Node<K,V> point = root;  // root, left
		
		while(true) {
			if(point == null) {
				return null;
			}
			int result = comp(point.getKey() , key);
			if(result==0) {
				return point.getValue();
			}else if(result>0) {
				point = point.left;
			}else {
				point = point.right;
			}
		}
	}
	
	public void subNodePrint(Node node) {
		if(node!=null) {
			subNodePrint(node.left);
			System.out.println(node.getKey() +" "+ node.data);
			subNodePrint(node.right);
		}
	}

	public void print() {
		if(root==null) {
			System.out.println("등록된 회원이 없습니다.");
		}else {
			subNodePrint(root);
		}
	}
}