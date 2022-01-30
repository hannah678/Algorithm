package al03_stack_queue;

public class IntQueue {
	int capacity; //큐의 크기
	
	int front;//제일 앞 위치
	int rear; //마지막위치
	int dataCnt;//queue 데이터의 갯수
		
	int queue[];//큐의 메모리 선언

	public IntQueue(int capacity) {
		this.capacity = capacity;
		queue = new int [capacity];
		
//		front = 0;   //생략가능. 멤버변수이기에 자동으로 0으로 초기화
//		rear = 0;    //생략가능. 멤버변수이기에 자동으로 0으로 초기화
//		dataCnt = 0; //생략가능. 멤버변수이기에 자동으로 0으로 초기화
	}
	
	public int getCapacity() {
		return capacity;
	}
	public int getFront() {
		return front;
	}
	public int getRear() {
		return rear;
	}
	public int getDataCnt() {
		return dataCnt;
	}
	public int[] getQueue() {
		return queue;
	}
	public int getRearData() {
		return queue[rear-1];
	}
	public int getFirstData() {
		return queue[front];
	}
	
	
	public int enqueue(int data) throws QueueOverFlowException{
		//데이터가 가득 찼는지 확인
		//capacity:용량,dataCnt:현재 데이터수
		if (capacity<=dataCnt) {//오버플로우 발생시 처리할 메서드 소환
			throw new QueueOverFlowException();
		}
		//데이터를 큐에 담는다(rear;위치에)
		queue[rear++] = data;
		dataCnt++;//데이터의 수 증가
		//rear의 위치를 링형으로 처리하기
		if(rear==capacity) {
			rear = 0;			
		}
		System.out.println("rear : "+rear+",남은 데이터 : "+dataCnt);
		return data;
	}
	//2. dequeue 데이터
	public int dequeue() throws QueueEmptyException{
		if(dataCnt<=0 ) {
			throw new QueueEmptyException();
		}
		//큐에 데이터가 있을 때 실행될 코드
		dataCnt--;//남아있는 객체의 수 1 감소
		int deData = queue[front++];
		if(front==capacity)
			front = 0;
		System.out.println("front : "+front+"남은 데이터 수 : "+dataCnt);
		return deData;
	}
	//3.큐의 제일 앞(front)데이터를 구한다.
	public int peek() throws QueueEmptyException{
		if(dataCnt<=0) {
			throw new QueueEmptyException();
		}
		return queue[front];
	}
	
	
	//큐가 비어있을때 Empty예외 클래스
	class QueueEmptyException extends RuntimeException{
		QueueEmptyException() {}
	}
	
	//오버플로우 발생시 처리할 예외
	class QueueOverFlowException extends RuntimeException {
		QueueOverFlowException() {}		
	}
}