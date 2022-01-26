package al03_stack_queue;

import java.util.EmptyStackException;

public class IntStack {
	//정수를 저장할 수 있는 배열을 생성
	int stk[];//정수를 담을 배열
	int capacity; //최대로 저장할 수 있는 객체의 수
	int point;//stack의 채워진 값의 위치+1
	
	IntStack(){}
	IntStack(int max){
		capacity = max; // 값을 저장할 수 있는 크기
		point = 0;
		stk = new int[max];
	}
	
	//데이터의 수를 리턴하는 메소드
	public int getSize() {
		return point;		
	}
	//메모리크기를 리턴하는 메소드
	public int getCapacity() {
		return capacity;
	}
	//스택에 데이터를 추가하는 메소드
	public int push(int data) throws OverflowIntStackExeption{
		if(point >= capacity) {
			throw new OverflowIntStackExeption();
		}
			return stk[point++] = data;
		
	}
	//스택의 제일 나중에 저장된 위치(point -1)의 값을 리턴하는 메소드
	public int pop() throws EmptyIntStackException{
		//스택이 비어있으면 empty 예외 발생시킬것
		if(point<=0) {
			throw new EmptyIntStackException();
		}
		return stk[--point];
	}
	//제일 위에 있는 데이터(point -1번째꺼)를 리턴한다
	public int peek() throws EmptyStackException{
		if(point<=0) {
			throw new EmptyIntStackException();
	        }
		  return stk[point-1];
    }
	public void print(){
		if(point<=0) {
			System.out.println("스택이 비어있습니다");
		}else {
			for(int i=0; i<point; i++) {
				System.out.println("stk["+i+"] :"+stk[i]);
			}
		}
	}
	//데이터의 index구하기
	public int indexOf(int search) {
		for(int i = point-1; i>= 0; i--) {// point-1부터 1씩 감소
			if(stk[i]==search)
				return i;
		}
		return -1;
	}
	
	//스택에 데이터가 존재하는지 확인하는 메소드
	public boolean isEmpty() {
		//비어있으면 true, 데이터가 있으면 false
		// return (point<=0) ? true:false;
		return point<=0;
	}
	
	public boolean isFull() {
		return point >= capacity;
	}
	
	//오버플로우 발생시 예외처리 클래스
	class OverflowIntStackExeption extends RuntimeException{
		public OverflowIntStackExeption() {};
	}
	
	//스택이 비어져있을때 empty 예외처리 클래스
	class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {};
	}
	
}

