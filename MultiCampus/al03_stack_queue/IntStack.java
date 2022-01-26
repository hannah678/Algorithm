package al03_stack_queue;

import java.util.EmptyStackException;

public class IntStack {
	//������ ������ �� �ִ� �迭�� ����
	int stk[];//������ ���� �迭
	int capacity; //�ִ�� ������ �� �ִ� ��ü�� ��
	int point;//stack�� ä���� ���� ��ġ+1
	
	IntStack(){}
	IntStack(int max){
		capacity = max; // ���� ������ �� �ִ� ũ��
		point = 0;
		stk = new int[max];
	}
	
	//�������� ���� �����ϴ� �޼ҵ�
	public int getSize() {
		return point;		
	}
	//�޸�ũ�⸦ �����ϴ� �޼ҵ�
	public int getCapacity() {
		return capacity;
	}
	//���ÿ� �����͸� �߰��ϴ� �޼ҵ�
	public int push(int data) throws OverflowIntStackExeption{
		if(point >= capacity) {
			throw new OverflowIntStackExeption();
		}
			return stk[point++] = data;
		
	}
	//������ ���� ���߿� ����� ��ġ(point -1)�� ���� �����ϴ� �޼ҵ�
	public int pop() throws EmptyIntStackException{
		//������ ��������� empty ���� �߻���ų��
		if(point<=0) {
			throw new EmptyIntStackException();
		}
		return stk[--point];
	}
	//���� ���� �ִ� ������(point -1��°��)�� �����Ѵ�
	public int peek() throws EmptyStackException{
		if(point<=0) {
			throw new EmptyIntStackException();
	        }
		  return stk[point-1];
    }
	public void print(){
		if(point<=0) {
			System.out.println("������ ����ֽ��ϴ�");
		}else {
			for(int i=0; i<point; i++) {
				System.out.println("stk["+i+"] :"+stk[i]);
			}
		}
	}
	//�������� index���ϱ�
	public int indexOf(int search) {
		for(int i = point-1; i>= 0; i--) {// point-1���� 1�� ����
			if(stk[i]==search)
				return i;
		}
		return -1;
	}
	
	//���ÿ� �����Ͱ� �����ϴ��� Ȯ���ϴ� �޼ҵ�
	public boolean isEmpty() {
		//��������� true, �����Ͱ� ������ false
		// return (point<=0) ? true:false;
		return point<=0;
	}
	
	public boolean isFull() {
		return point >= capacity;
	}
	
	//�����÷ο� �߻��� ����ó�� Ŭ����
	class OverflowIntStackExeption extends RuntimeException{
		public OverflowIntStackExeption() {};
	}
	
	//������ ����������� empty ����ó�� Ŭ����
	class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {};
	}
	
}

