package al04_linkedlist;

import java.util.Scanner;

import al04_linkedlist.LinkedListTest.Node;

public class LinkedListTestMain {
	static Scanner scan = new Scanner(System.in);
	
	//번화와 이름을 저장할수 있는 내부클래스
	static class Data{
		private Integer no;
		private String name;
		
		static final int NO = 1;//번호를 입력받을지 확인
		static final int NAME = 2;
		
		//String 리턴으로 값을 반환
		public String toString() {
			return no+" : "+name;
		}
		//번호 또는 입력받을 메서드
		public void scanData(String msg,int s) {
			//s에는 1,2,3중에 하나가 들어감
			if((s & NO) == NO) {
				System.out.print("번호=>");	 //번호입력
				no=scan.nextInt();
			}if((s & NAME) ==NAME) {
				System.out.print("이름=>");	 //이름입력
				name = scan.next(); //이름에 공백이 들어가면 안됨. 공백 기준으로 한 단어만 입력받음
			}
		}
	}
	
	//메뉴를 열거형으로 만들기
	enum Menu{
		ADD_FIRST("머리에 노드 삽입 "),
		ADD_LAST("꼬리에 노드 삽입 "),
		REMOVE_FIRST("머리 노드 삭제"),
		REMOVE_CURRENT("선택한 노드 삭제 "),
		DUMP("모든 노드 출력  "),
		TERMINATE("종료"); 
		
		private final String message;
		
		static Menu MenuAt(int idx) {
			for (Menu m:Menu.values()) {
				if(m.ordinal()==idx)
					return m;
			}
			return null;
		}
		Menu(String str) {
			message = str;
		}
		String getMessage() {
			return message;
		}
	}
	//메뉴를 표시하고 메뉴의 index를 입력받아 선택한 메뉴객체 리턴하는 메소드
	static Menu SelectMenu() {
		int key;
		do {
			for(Menu m:Menu.values()) {
				System.out.printf("(%d) %s",m.ordinal()+1,m.getMessage());
				if((m.ordinal()+1)%3==0) {
					System.out.println();
				}
			}
			System.out.print("-> 메뉴 번호 입력 : ");
			key = scan.nextInt()-1;
		}while(key<Menu.ADD_FIRST.ordinal() || key>Menu.TERMINATE.ordinal());
	
		return Menu.MenuAt(key);
	}
	
	
	public static void main(String[] args) {
		Menu menu;
		LinkedListTest<Data> list = new LinkedListTest<Data>();
	
		do {
			//메뉴가 표시
			menu = SelectMenu();
			Data data = new Data();
			switch(menu) {
			case ADD_FIRST://1.머리에 노드 삽입
				data.scanData("머리노드 삽입",Data.NO | Data.NAME);
				list.addFirst(data);//List에
				break;
			case ADD_LAST://2.꼬리에 노드 삽입
				data.scanData("꼬리노드 삽입", Data.NO | Data.NAME);
				list.addLast(data);
				break;
			case REMOVE_FIRST://3.머리노드 삭제
				list.removeFirst();
				break;
			case REMOVE_CURRENT://4.선택 노드 삭제
				list.removeCurrent();
				break;
			case DUMP://5.모든노드 출력
				list.dump();
				break;
			}
		}while(menu !=Menu.TERMINATE);//6.프로그램 종료
		System.out.println("프로그램이 종료되었습니다.");
	}
}