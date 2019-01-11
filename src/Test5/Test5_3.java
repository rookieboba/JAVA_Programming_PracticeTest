package Test5;
import java.util.Scanner;
public class Test5_3 {

	public static int Fibonacci(int n){
		if (n==1)
			return 0;
		
		else if(n==2)
			return 1;
		
		else return Fibonacci(n-1)+Fibonacci(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1,sum=0,count=1;
		Scanner stdin=new Scanner (System.in);
		
		n=stdin.nextInt();
		do{
			sum= Fibonacci(n);
			count++;
		}while(count==n);
	}

}
