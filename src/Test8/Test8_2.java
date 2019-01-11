package Test8;
import java.util.*;

public class Test8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner stdin=new Scanner(System.in);
		int input;
		
		System.out.print("입력할 정수들의 수를 입력하세요: ");
		input=stdin.nextInt();
		
		int arr[]=new int[input];
		//두번째 배열을 만들지 말아라
		for(int i=0; i < input ; i++) {
			System.out.print( i+1 +"번째 점수를 입력하세요: ");
			arr[i]=stdin.nextInt();
		}
		
		System.out.println("본래 순서의 점수들: ");
		for(int i=0; i<input ; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("반대 순서의 점수들: ");
		for(int i=input-1; i>=0 ; i--){
			System.out.print(arr[i]+" ");
		}
	}
}
//역순으로 출력말고 재배치할것
