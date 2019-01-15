package Test8;

//8_10 , p.337
//�ؾ��� �� 
//1�� : sorting 
//2��: \index �� static �� �ƴѰɷ� 
import java.util.*;

public class ClassRoll {

	String subject; // ���� �̸�
	private static int volume; // �⼮�ο� ���� ���� �ִ� ��
	static int index; // Ư�� �л��� ���� ��ġ

	static Student st[] = new Student[30];

	public ClassRoll() {

		String subject = "";
		index = 0;
		volume = 30;
		st = new Student[volume];

	}

	public static void SearchIndex(int regist_number) { // index ã��

		int check = 0;
		for (int i = 0; i <= index; i++) {
			if (regist_number == st[i].registration_number) {
				System.out.println("��ġ�� " + index);
				check = 1;
			}
		}
		if (check == 0)
			System.out.println("�־��� �л��� �������� �ʾ� -1�� ��ȯ");

	}

	public static void Delete(int regist_number) { // �־��� �й��� ���� �л��� �⼮�ο��� ����

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
			System.out.println("�־��� �л��� �⼮�ο� ���� ������ �� �����ϴ�.");
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
			System.out.println("�־��� �л��� �⼮�ο� �����ϴ�.");
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
				System.out.println("�⼮���� ũ�� �������� �߰��� �� �����ϴ�.");
				return 0;
			}
		}
		return 1;
	}
	// �־��� �й��� ���� �л��� �⼮�ο��� ã�Ƽ� �̸��˷���

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
			System.out.println("�־��� �л��� �⼮�ο� �����ϴ�.");

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

				System.out.print("�л� �̸��� �й��� �Է��ϼ���:");

				st[i].name = stdin.next();
				st[i].registration_number = stdin.nextInt();

				System.out.println("1��: �й����� ��ġ(index) �˷��ֱ�  ");
				System.out.println("2��: �й����� ���� �����ϱ�  ");
				System.out.println("3��: �й����� �̸� �˷��ֱ�  ");
				System.out.print("����� �����Ͻðڽ��ϱ�?  ");

				choose = stdin.nextInt();

				switch (choose) {

				case 1:
					System.out.print("�й��� �Է����ּ���:");
					regist_number = stdin.nextInt();
					SearchIndex(regist_number);
					break;

				case 2:
					System.out.print("�й��� �Է����ּ���:");
					regist_number = stdin.nextInt();
					Delete(regist_number);

					break;

				case 3:
					System.out.print("�й��� �Է����ּ���:");
					regist_number = stdin.nextInt();
					SearchName(regist_number);
					break;

				default:
					System.out.println("�ٽ� �Է��ϼ���.");
					index--;
					i--;

					// sort ��Ű�� delete �ؾ� ��;;
				}

				if (Limitcheck() == 0)
					index = volume;
				index++;

			}
		}
	}
}
