package Test8;

//8_10 , p.337
//해야할 것 
//1번 : sorting 
//2번:searchindex 에러 상황 

import java.util.*;

public class ClassRoll {

	String subject; // 과목 이름
	private static int volume; // 출석부에 포함 가능 최대 수
	static int index; // 특정 학생의 현재 위치

	static Student st[] = new Student[30];
	private static String Calculate;

	public ClassRoll() {

		//String subject ;
		index = 0;
		volume = 30;
		st = new Student[volume];
		//String Calculate;
	}

	public static void SearchIndex(int regist_number) { // index 찾기

		int check = 0;
		for (int i = 0; i <= index; i++) {
			if (regist_number == st[i].registration_number) {
				System.out.println("위치는 " + (index + 1) + "번째");
				check = 1;
			}
		}
		if (check == 0)
			System.out.println("주어진 학생은 존재하지 않아 -1을 반환");

	}

	public static void Delete(int regist_number) { // 주어진 학번을 가진 학생을 출석부에서 삭제

		int check = 0;
		int temp;
		// int tmp_num;
		// int tmp_name;
		// int tmp_index;

		for (int i = 0; i < index; i++) {

			try {
				if (st[i].registration_number == regist_number) {

					for (int j = i; j < index ; j++) {
						st[j].registration_number = st[j + 1].registration_number;
						st[j].name = st[j + 1].name;
						st[j].index = st[j + 1].index;
						st[j].index-=1;
					}
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("딜리트 문제 ! 오류 떴어요 지금");
			}

			check = 1;
		}

		if (check == 0) {
			System.out.println("주어진 학생이 출석부에 없어 삭제할 수 없습니다.");
		}
	}

	public static void SearchName(int regist_number) {

		int check = 0;
		for (int i = 0; i <= index; i++) {
			if (regist_number == st[i].registration_number) {
				System.out.println(st[i].getName());
				check = 1;
				break;
			}
		}
		if (check == 0)
			System.out.println("주어진 학생이 출석부에 없습니다.");
	}

	// public void Sort(){
	//
	// int temp=-1;
	// String tmp=null;
	//
	// for(int i=0;i<=index;i++){
	// if(st[i].getNumber()>st[i+1].getNumber()){
	//// temp=st[i].registration_number;
	//// st[i].registration_number=st[i+1].registration_number;
	//// st[i+1].registration_number =temp;
	//// tmp=st[i].name;
	////
	//
	// }
	// }
	// }

	// 주어진 학번을 가진 학생을 출석부에서 찾아서 이름알려줌

	public static void NameFound(int regist_number) {
		int check = 0;
		for (int i = 0; i <= index; i++) {

			if (st[i].registration_number == regist_number) {
				System.out.println(st[i].getName());
				check = 1;
				break;
			}
		}
		if (check == 0)
			System.out.println("주어진 학생이 출석부에 없습니다.");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin = new Scanner(System.in);
		
		int choose;
		int regist_number;
		int new_number = 0;
		String new_name = null;
		int i = 0;
		ClassRoll[] cr=new ClassRoll[30];
		
		while (index != 30) {
			
			st[i] = new Student(new_number, new_name);
			//System.out.print("교과목명을 입력하세요:");
			
//			cr[i].subject=stdin.nextLine();
//			System.out.println("원하는 연산을 선택하세요:");
//			cr[i].Calculate=stdin.next();
//			System.out.println("<추가>");
//			System.out.println("<결제?");
//			System.out.println("<찾기>");
//			System.out.println("<출");
//			System.out.println("<추가");
//			
			System.out.print("학생 이름과 학번을 입력하세요:");
			System.out.println();
			st[i].name = stdin.next();
			st[i].registration_number = stdin.nextInt();
			st[i].index = index + 1;

			System.out.println("1번: 학번으로 위치(index) 알려주기  ");
			System.out.println("2번: 학번으로 정보 삭제하기  ");
			System.out.println("3번: 학번으로 이름 알려주기  ");
			System.out.println();
			System.out.println("몇번을 선택하시겠습니까? ");

			choose = stdin.nextInt();

			switch (choose) {

			case 1:
				System.out.println("학번을 입력해주세요:");
				
				regist_number = stdin.nextInt();
				System.out.println();
				SearchIndex(regist_number);
				break;

			case 2:
				System.out.print("학번을 입력해주세요:");
				System.out.println();
				regist_number = stdin.nextInt();
				Delete(regist_number);

				break;
			// sort 시키고 delete 해야 함;;
			case 3:
				System.out.print("학번을 입력해주세요:");

				regist_number = stdin.nextInt();
				SearchName(regist_number);
				break;

			default:

				System.out.println("다시 입력하세요.");
				break;

			} // switch 끝

			index++;
			i++;

			if (choose != 1 && choose != 3) {
				index--;
				i--;
			}

			System.out.println("학생 이름				학번					위치");

			for (int j = 0; j < index; j++) {
				System.out.println(st[j].name + "				" + st[j].registration_number + " 					"
						+ st[j].index + "번째");
			}

		} // while 끝

		System.out.println("끝났습니다.");
	} // main 끝

} // class 끝
