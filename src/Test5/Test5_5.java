package Test5;

import java.util.Scanner;

public class Test5_5 {
	
	public static int powerDoWhile(int N){
		
		int sum=1;
		int i=1;
		
		do{
			sum*=2;
			i++;
		} while(i!=(N+1));
		
		return sum;
	}
	public static int powerRecursive(int N){
		
		if (N==1) return 2;
		else return 2* powerRecursive(N-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.print("������ �Է��Ͻÿ�: ");
		Scanner stdin= new Scanner(System.in);
		int num=stdin.nextInt();
		
		System.out.println("powerDoWhile �޼ҵ带 ����Ͽ� ���� ����" + powerDoWhile(num)+"�̴�.");
		System.out.println("powerRecursive �޼ҵ带 ����Ͽ� ���� ����" + powerRecursive(num)+"�̴�.");
		
	}

}
