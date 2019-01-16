package Test8;

//8_10 , p.337
//�ؾ��� �� 
//1�� : sorting 
//2��:searchindex ���� ��Ȳ 

import java.util.*;

public class ClassRoll {

	String subject; // ���� �̸�
	private static int volume; // �⼮�ο� ���� ���� �ִ� ��
	static int index; // Ư�� �л��� ���� ��ġ

	static Student st[] = new Student[30];
	private static String Calculate;

	public ClassRoll() {

		//String subject ;
		index = 0;
		volume = 30;
		st = new Student[volume];
		//String Calculate;
	}

	public static void SearchIndex(int regist_number) { // index ã��

		int check = 0;
		for (int i = 0; i <= index; i++) {
			if (regist_number == st[i].registration_number) {
				System.out.println("��ġ�� " + (index + 1) + "��°");
				check = 1;
			}
		}
		if (check == 0)
			System.out.println("�־��� �л��� �������� �ʾ� -1�� ��ȯ");

	}

	public static void Delete(int regist_number) { // �־��� �й��� ���� �л��� �⼮�ο��� ����

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
				System.out.println("����Ʈ ���� ! ���� ����� ����");
			}

			check = 1;
		}

		if (check == 0) {
			System.out.println("�־��� �л��� �⼮�ο� ���� ������ �� �����ϴ�.");
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
			System.out.println("�־��� �л��� �⼮�ο� �����ϴ�.");
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
		int i = 0;
		ClassRoll[] cr=new ClassRoll[30];
		
		while (index != 30) {
			
			st[i] = new Student(new_number, new_name);
			//System.out.print("��������� �Է��ϼ���:");
			
//			cr[i].subject=stdin.nextLine();
//			System.out.println("���ϴ� ������ �����ϼ���:");
//			cr[i].Calculate=stdin.next();
//			System.out.println("<�߰�>");
//			System.out.println("<����?");
//			System.out.println("<ã��>");
//			System.out.println("<��");
//			System.out.println("<�߰�");
//			
			System.out.print("�л� �̸��� �й��� �Է��ϼ���:");
			System.out.println();
			st[i].name = stdin.next();
			st[i].registration_number = stdin.nextInt();
			st[i].index = index + 1;

			System.out.println("1��: �й����� ��ġ(index) �˷��ֱ�  ");
			System.out.println("2��: �й����� ���� �����ϱ�  ");
			System.out.println("3��: �й����� �̸� �˷��ֱ�  ");
			System.out.println();
			System.out.println("����� �����Ͻðڽ��ϱ�? ");

			choose = stdin.nextInt();

			switch (choose) {

			case 1:
				System.out.println("�й��� �Է����ּ���:");
				
				regist_number = stdin.nextInt();
				System.out.println();
				SearchIndex(regist_number);
				break;

			case 2:
				System.out.print("�й��� �Է����ּ���:");
				System.out.println();
				regist_number = stdin.nextInt();
				Delete(regist_number);

				break;
			// sort ��Ű�� delete �ؾ� ��;;
			case 3:
				System.out.print("�й��� �Է����ּ���:");

				regist_number = stdin.nextInt();
				SearchName(regist_number);
				break;

			default:

				System.out.println("�ٽ� �Է��ϼ���.");
				break;

			} // switch ��

			index++;
			i++;

			if (choose != 1 && choose != 3) {
				index--;
				i--;
			}

			System.out.println("�л� �̸�				�й�					��ġ");

			for (int j = 0; j < index; j++) {
				System.out.println(st[j].name + "				" + st[j].registration_number + " 					"
						+ st[j].index + "��°");
			}

		} // while ��

		System.out.println("�������ϴ�.");
	} // main ��

} // class ��
