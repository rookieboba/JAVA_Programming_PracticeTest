package Test5;
import java.util.Scanner;

public class Test5_4 {

	public static int CalculateCubeFor(int N){
		int sum=0;
		
		for(int i=1; i<=N;i++){ 
			sum+=i*i*i;
		}
		return sum;
	}
	
	public static int CalculateCubeDo(int N){
		int sum=0;
		int i=1;
		do{
			sum+=i*i*i;
			i++;
		}while(i!=(N+1));
		return sum;
	}
	
	public static int CalculateCubeRecursive(int N){
		
		
		if (N == 1) return 1; 
		
		return CalculateCubeFor(N-1) + N*N*N;
		
	}

	public static void main(String[] args) {
		
		int sum=0;
		Scanner stdin= new Scanner (System.in);
		System.out.print("정수를 입력하시오: ");
		int n=stdin.nextInt();
		
		System.out.println("CalculateCubeFor라는 메소드를 이용하여 구한 값은 "+ CalculateCubeFor(n)+" 이다.");
		System.out.println("CalculateCubeDo라는 메소드를 이용하여 구한 값은 "+ CalculateCubeDo(n)+" 이다.");
		System.out.println("CalculateCubeRecursive라는 메소드를 이용하여 구한 값은 "+ CalculateCubeRecursive(n)+" 이다.");
		
	}
}
