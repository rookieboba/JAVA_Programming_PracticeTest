package Test8;
import java.util.*;

public class Test8_1 {

	public static void main(String[] args) {

		Scanner stdin=new Scanner(System.in);
		
		System.out.print("���� 10���� �Է��Ͻÿ� :");
		int sum=0;
		int arr[]=new int[10];
		int a;
		
		for(int i=0;i<10;i++){
			a= stdin.nextInt();
			sum+= a;
		}
		double avg=(double) sum/arr.length;
		
		System.out.print("�հ�� ����� ���� " + sum +" �� " + avg +"�̴�.");
	}

}
