package Test9_1;

import java.util.*;

public class Driver extends MonetaryCoin {

	// ��ü���� ���� ����
	// ��ü���� ��Ÿ���� ������ ���� ����� ���
	static int sum = 0;

	public Driver(int plane, int amount, int sum) {
		super(plane, amount);
		Driver.sum = sum;
	}

	public static void Sum(int amount) {
		sum += amount;
	}

	public static void main(String args[]) {

		Scanner stdin= new Scanner (System.in);
		Driver[] dr=new Driver[4];
		//int tmp;
		int amount;
		for (int i = 0; i < dr.length; i++) {
			
		
//			System.out.print("���� " + (i + 1));
//		
//			System.out.print(dr[i].getPlane(dr[i].setRand()));
//			//
			System.out.print("��= " );
			amount=stdin.nextInt();
			System.out.println(amount);
			Sum(dr[i].amount);
		
		}
		System.out.println();
		System.out.println("���� ������ ��:" +sum);

	}
}
