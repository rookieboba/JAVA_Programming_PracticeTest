package Test8;
import java.util.*;

public class Test8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner stdin=new Scanner(System.in);
		int input;
		
		System.out.print("�Է��� �������� ���� �Է��ϼ���: ");
		input=stdin.nextInt();
		
		int arr[]=new int[input];
		//�ι�° �迭�� ������ ���ƶ�
		for(int i=0; i < input ; i++) {
			System.out.print( i+1 +"��° ������ �Է��ϼ���: ");
			arr[i]=stdin.nextInt();
		}
		
		System.out.println("���� ������ ������: ");
		for(int i=0; i<input ; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("�ݴ� ������ ������: ");
		for(int i=input-1; i>=0 ; i--){
			System.out.print(arr[i]+" ");
		}
	}
}
//�������� ��¸��� ���ġ�Ұ�
