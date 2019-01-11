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
		
		System.out.print("정수 N을 입력하세요:");
		int N=stdin.nextInt();
	
		System.out.print("자연수 k를 입력하세요:");
		int k=stdin.nextInt();

		while(k<0){
			
			System.out.println("자연수 k를 입력하세요:");
			k=stdin.nextInt();
			
		}
		
		System.out.println("CalculatePowerWhile이라는 메소드를 이용하여 구한 값은 "+ CalculatePowerWhile(N,k) + "이다.");
		System.out.println("CalculatePowerFor이라는 메소드를 이용하여 구한 값은 "+ CalculatePowerFor(N,k) + "이다.");
		System.out.println("CalculatePowerRecursive이라는 메소드를 이용하여 구한 값은 "+ CalculatePowerRecursive(N,k) + "이다.");
	}

}
