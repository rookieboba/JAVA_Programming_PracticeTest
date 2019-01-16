package Test9_1;

import java.util.*;

public class Driver extends MonetaryCoin {

	// 객체들의 현재 상태
	// 객체들이 나타내는 값들의 합을 계산후 출력
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
			
		
//			System.out.print("동전 " + (i + 1));
//		
//			System.out.print(dr[i].getPlane(dr[i].setRand()));
//			//
			System.out.print("값= " );
			amount=stdin.nextInt();
			System.out.println(amount);
			Sum(dr[i].amount);
		
		}
		System.out.println();
		System.out.println("동전 값들의 합:" +sum);

	}
}
