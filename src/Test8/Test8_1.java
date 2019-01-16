package Test8;
import java.util.*;

public class Test8_1 {

	public static void main(String[] args) {

		Scanner stdin=new Scanner(System.in);
		
		System.out.print("정수 10개를 입력하시요 :");
		int sum=0;
		int arr[]=new int[10];
		int a;
		
		for(int i=0;i<10;i++){
			a= stdin.nextInt();
			sum+= a;
		}
		double avg=(double) sum/arr.length;
		
		System.out.print("합계와 평균은 각각 " + sum +" 과 " + avg +"이다.");
	}

}
