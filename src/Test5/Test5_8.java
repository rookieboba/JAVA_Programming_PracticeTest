package Test5;

import java.util.*;

public class Test5_8 {
	
	public static int DecToOctWhile(int dec){
		
		int octal=0, count=0;
		int deccopy=dec;
		int sum=0;
		
		
		while(dec>1){	//���ڸ� ������ ���

			dec=dec/8;	//�ڿ����� 8�� ���� �� floor �� �Ͽ� �Ҽ����� �������� ������ 8�� �������� ���Ѵ� �ص� ������ ���� ��ã���� ����
			count++;
		}
		dec=deccopy;	//�ӽ÷� ������ �� ������ dec ��
		
		int arr[]=new int[count];	
		int i=0;

		while(dec>1){
			arr[count-1-i]=dec%8;
			dec=dec/8;
			sum+=pow(10,i)*arr[count-i-1];
			i++;
		}
		//���迭;;;

		return sum;
	}



	private static int pow(int i, int count) {
		// TODO Auto-generated method stub
		int sum=1;
		for(int n=1;n<=count;n++){
			sum*=i;
		}
		return sum;
	}


/*
	public static int DecToOctRecursive(int dec){
		
		
		int sum=0,count=0;
		int deccopy=dec;
		
		if (dec<8) return dec;
		
			
		while(dec>8){
			count++;
			dec=dec/8;
		}	

		dec=deccopy;
		int a= dec%8;
		
		sum=a* pow(10,arr[count]-1);
		
		
		return sum+ DecToOctRecursive(dec/8);
	}
*/	

	public static void main(String[] args) {
		
	
		int num;
		System.out.print("�ڿ����� �Է��Ͻÿ�:");
		Scanner stdin= new Scanner (System.in);
		
		num=stdin.nextInt();
		
		System.out.println("�Լ� DecToOctWhile �� �̿��Ͽ� 10����" + num + "�� 8������ �ٲٸ� " + DecToOctWhile(num) +"�̴�.");
		//System.out.println("�Լ� DecToOctRecursive �� �̿��Ͽ� 10����" + num + "�� 8������ �ٲٸ� " + DecToOctRecursive(num) +"�̴�.");
	}

}
