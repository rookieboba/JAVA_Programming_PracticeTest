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
		System.out.print("������ �Է��Ͻÿ�: ");
		int n=stdin.nextInt();
		
		System.out.println("CalculateCubeFor��� �޼ҵ带 �̿��Ͽ� ���� ���� "+ CalculateCubeFor(n)+" �̴�.");
		System.out.println("CalculateCubeDo��� �޼ҵ带 �̿��Ͽ� ���� ���� "+ CalculateCubeDo(n)+" �̴�.");
		System.out.println("CalculateCubeRecursive��� �޼ҵ带 �̿��Ͽ� ���� ���� "+ CalculateCubeRecursive(n)+" �̴�.");
		
	}
}
