package Test5;
import java.util.Scanner;
public class Test5_2 {

	public static int gcd(int x, int y){
		if (y==0)
			return x;
		else 
			return gcd(y,x%y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0,y = 0;
		Scanner stdin=new Scanner(System.in);
		System.out.print("x,y�� ���� �Է�: ");
		x=stdin.nextInt();
		y=stdin.nextInt();
		if((gcd(x,y))<0)
			System.out.println("�ִ������� ���� �� ����");
	}

}
