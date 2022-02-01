package al04_linkedlist;

public class LinkedListTest<E> {
	//노드클래스
	class Node<E>{
		private E data;
		private Node<E> next;//뒤쪽노드
		Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}
	//
	public LinkedListTest() {
		//head,current를 초기화
		head = null;
		current = null;
	}
	
	//머리노드를 저장 할 변수
	private Node<E> head;
	private Node<E> current;
	
	//1.머리에 노드 삽입
	public void addFirst(E data) {
		//지금 현재 헤더
		Node<E> point = head;
		head = current = new Node<E>(data, point);
	}
	//2.꼬리에 노드 삽입
	public void addLast(E data) {
		if(head == null) {//저장된 리스트가 없으면 -> 헤드에 노드 삽입
			addFirst(data);
		}else {//저장된 리스트가 있으면
			Node<E> point = head;
			while(point.next!= null) {
				point = point.next; //next가 있는 경우 넘어가
			}
			//point는 next가 null인 노드(즉, 다음 노드가 없는 마지막 노드)
			current = point.next = new Node<E>(data,null);
		}
	}
	//3.머리 노드 삭제
	public void removeFirst() {
		if(head!=null) {//노드가 존재하면
			current = head = head.next;
		}
	}
	//4.선택 노드 삭제
	public void removeCurrent() {
		remove(current);
	}
	//4-1.노드 삭제
	public void remove(Node<E> delNode) {
		if(head != null) {//노드가 존재하면
			if(head==delNode) {//삭제할 노드가 헤드노드면
				removeFirst(); //헤드노드 삭제 메서드 사용하고		
			}else {
				Node<E> point = head;
				while(point.next != delNode) {//delNode의 앞 노드 찾기
					point=point.next;
				}
				//point는 delNode의 이전노드
				point.next = delNode.next;
				current = point;
			}
		}
		
	}
	//5.모든 노드 출력
	public void dump() {
		Node<E> point = head;
			while(point !=null) {
			System.out.println(point.data);
			point = point.next;
		}
	}
}