package Test5;

import java.util.Scanner;
public class Test5_6 {
	
	public static int CalculatePowerWhile(int N, int k){
		int i=1;
		int count=1;
		
		while(k!=(i-1)){
			
			count*=N;
			i++;
		}
			return count;
	}
	
	public static int CalculatePowerFor(int N, int k){
		int i;
		int count=1;
		for(i=1;i<=k;i++){
			count*=N;
		}
		return count;
	}
	
	public static int CalculatePowerRecursive(int N, int k){
		
		if(k==0) return 1;
		else return CalculatePowerRecursive(N,k-1) * N;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin=new Scanner(System.in);
		
		System.out.print("���� N�� �Է��ϼ���:");
		int N=stdin.nextInt();
	
		System.out.print("�ڿ��� k�� �Է��ϼ���:");
		int k=stdin.nextInt();

		while(k<0){
			
			System.out.println("�ڿ��� k�� �Է��ϼ���:");
			k=stdin.nextInt();
			
		}
		
		System.out.println("CalculatePowerWhile�̶�� �޼ҵ带 �̿��Ͽ� ���� ���� "+ CalculatePowerWhile(N,k) + "�̴�.");
		System.out.println("CalculatePowerFor�̶�� �޼ҵ带 �̿��Ͽ� ���� ���� "+ CalculatePowerFor(N,k) + "�̴�.");
		System.out.println("CalculatePowerRecursive�̶�� �޼ҵ带 �̿��Ͽ� ���� ���� "+ CalculatePowerRecursive(N,k) + "�̴�.");
	}

}
