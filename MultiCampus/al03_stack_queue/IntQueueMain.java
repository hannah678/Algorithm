package al03_stack_queue;

import java.util.Scanner;

public class IntQueueMain {
    static Scanner s = new Scanner(System.in);
    
    //메뉴를 입력받는 메소드
    static String getMenu() {
        System.out.print("[메뉴] | 1.enqueue | 2.dequeue | 3.peek | 4.info | 9.end |");
        return s.nextLine();
    }

    public static void main(String[] args) {
        
        IntQueue queue = new IntQueue(10);
        
        while(true) {
            String menu = getMenu();
            if(menu.equals("9")) {//9. end선택시
                break;
            }else {//그 외 메뉴 선택
                switch(menu) {
                case "1" : //큐에 데이터를 추가한다.
                	System.out.print("큐에 추가할 데이터->");
                	int data = Integer.parseInt(s.nextLine());
                	try {
                		int result = queue.enqueue(data);
                	}catch(Exception e) {
                		System.out.println("큐가 가득찼습니다.");
                	}
                    break;
                
                case "2" : //큐에서 제일 앞의 데이터를 가져온다.
                	try {
                		int result = queue.dequeue();
                		System.out.println("큐에서 가져온 데이터 : "+result);
                	}catch(Exception e) {
                		System.out.println("큐가 비어있습니다.");
                	}
                	break;
                	
                case "3" : //3. 제일 앞의 값을 구하여 출력
                	try {
                		int result = queue.peek();
                		System.out.println("큐의 제일 앞 데이터 : "+result);
                	}catch(Exception e) {
                		System.out.println("큐가 비어있습니다.");
                	}
                	break;
                	
                case "4" : //4. que의 크기, 데이터의 수, front인덱스, rear인덱스, 처음 값과 마지막 값을 구하라
                	System.out.println("① 큐의 크기 : "+queue.getCapacity());
                	System.out.println("② 데이터 수 : "+queue.getDataCnt());
                	System.out.println("③ front 위치 : "+queue.getFront());
                	System.out.println("④ rear 위치 : "+queue.getRear());
                	System.out.println("⑤ 처음 값 : "+queue.peek());
                	System.out.println("⑥ 마지막 값 : "+queue.getRearData());

                default:
                    System.out.println("메뉴를 잘못선택하였습니다.");
                }
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}