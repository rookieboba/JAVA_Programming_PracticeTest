package Test5;
import java.util.Scanner;
public class Test5_7 {

	public static int AddIntdo(int n){
	
		int sum=0;
		do{
			sum+=n%10;	
			n/=10;
		}while(n>=1);
	
		return sum;
	}
	
	public static int AddIntRecursive(int n){
		
	
		if (n<10) return n;
		else
			return ((n%10) + AddIntRecursive(n/10));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.print("������ �Է��Ͻÿ�: ");
		Scanner stdin=new Scanner(System.in);
		num=stdin.nextInt();
		
		System.out.println("AddIntdo�� �� ������� " + AddIntdo(num)+ " �Դϴ�.");

		System.out.println("AddIntRecursive�� �� ������� " + AddIntRecursive(num)+ " �Դϴ�.");
		
	}

}
