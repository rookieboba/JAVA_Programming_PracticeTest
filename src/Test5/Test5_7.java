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
		System.out.print("정수를 입력하시요: ");
		Scanner stdin=new Scanner(System.in);
		num=stdin.nextInt();
		
		System.out.println("AddIntdo로 한 결과값은 " + AddIntdo(num)+ " 입니다.");

		System.out.println("AddIntRecursive로 한 결과값은 " + AddIntRecursive(num)+ " 입니다.");
		
	}

}
