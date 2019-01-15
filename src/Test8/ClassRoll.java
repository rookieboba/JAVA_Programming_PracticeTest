package Test8;

//8_10 , p.337
//해야할 것 
//1번 : sorting 
//2번: \index 가 static 이 아닌걸로 
import java.util.*;

public class ClassRoll {

	String subject; // 과목 이름
	private static int volume; // 출석부에 포함 가능 최대 수
	static int index; // 특정 학생의 현재 위치

	static Student st[] = new Student[30];

	public ClassRoll() {

		String subject = "";
		index = 0;
		volume = 30;
		st = new Student[volume];

	}

	public static void SearchIndex(int regist_number) { // index 찾기

		int check = 0;
		for (int i = 0; i <= index; i++) {
			if (regist_number == st[i].registration_number) {
				System.out.println("위치는 " + index);
				check = 1;
			}
		}
		if (check == 0)
			System.out.println("주어진 학생은 졵재하지 않아 -1을 반환");

	}

	public static void Delete(int regist_number) { // 주어진 학번을 가진 학생을 출석부에서 삭제

		int check = 0;
		int temp;
		for (int i = 0; i <= index; i++) {
			if (st[i].registration_number == regist_number) {

				st[i].registration_number = 0;
				st[i].name = null;
				index = i;
				index--;
				check = 1;
			}
		}

		if (check == 0) {
			System.out.println("주어진 학생이 출석부에 없어 삭제할 수 없습니다.");
		}
	}

	public static void SearchName(int regist_number) {

		int check = 0;
		for (int i = 0; i <= index; i++) {
			if (regist_number == st[index].registration_number) {
				System.out.println(st[index].getName());
				check = 1;
				break;
			}
		}
		if (check == 0)
			System.out.println("주어진 학생이 출석부에 없습니다.");
	}

	// public void sort(Student st[int A],Student st [int B]){
	//
	// int temp=0;
	// String tp="";
	// if(st[A].registration_number > st[B].registration_number){
	// temp=st[A].getNumber();
	// st[A].getNumber()=st[B].getNumber();
	// st[B].getNumber()=temp;
	//
	// tp=st[A].getName();
	// st[A].getName()=st[B].getName();
	// st[B].getName()=temp;
	// }
	// }
	public static int Limitcheck() {
		for (int i = 0; i <= index; i++) {
			if (st[i].index > volume) {
				System.out.println("출석부의 크기 부족으로 추가할 수 없습니다.");
				return 0;
			}
		}
		return 1;
	}
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

		while (index != volume) {
			for (int i = 0; i < volume; i++) {

				st[i] = new Student(new_number, new_name);

				System.out.print("학생 이름과 학번을 입력하세요:");

				st[i].name = stdin.next();
				st[i].registration_number = stdin.nextInt();

				System.out.println("1번: 학번으로 위치(index) 알려주기  ");
				System.out.println("2번: 학번으로 정보 삭제하기  ");
				System.out.println("3번: 학번으로 이름 알려주기  ");
				System.out.print("몇번을 선택하시겠습니까?  ");

				choose = stdin.nextInt();

				switch (choose) {

				case 1:
					System.out.print("학번을 입력해주세요:");
					regist_number = stdin.nextInt();
					SearchIndex(regist_number);
					break;

				case 2:
					System.out.print("학번을 입력해주세요:");
					regist_number = stdin.nextInt();
					Delete(regist_number);

					break;

				case 3:
					System.out.print("학번을 입력해주세요:");
					regist_number = stdin.nextInt();
					SearchName(regist_number);
					break;

				default:
					System.out.println("다시 입력하세요.");
					index--;
					i--;

					// sort 시키고 delete 해야 함;;
				}

				if (Limitcheck() == 0)
					index = volume;
				index++;

			}
		}
	}
}
