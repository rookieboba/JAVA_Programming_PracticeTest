//1���� N ������ ��� �������� ������ ��
package Test5;
import java.util.Scanner;
public class Test5_1 {

	public static int sumWhile(int num){
		return num * num ;
	}
	public static int sumRecursive(int num){
		
		if(num<=1)
			return 1;
		else
			return (num*num+ sumRecursive(num-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int count;
		int sumWhile=0;
		int sumRecursive = 0;
		Scanner stdin= new Scanner (System.in);
		System.out.print("������ �Է��ϼ���:");
		count=stdin.nextInt();
		
		while(num!=(count+1)){
			sumWhile+=sumWhile(num);
			num++;
		}
		sumRecursive=sumRecursive(count);
		
		System.out.println("sumWhile �޼ҵ带 ����Ͽ� ���� ����" + sumWhile + "�̴�.");
		System.out.println("sumRecursive �޼ҵ带 ����Ͽ� ���� ����" + sumRecursive + "�̴�.");
	}

}
