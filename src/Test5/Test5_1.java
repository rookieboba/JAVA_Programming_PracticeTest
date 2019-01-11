//1부터 N 사이의 모든 정수들의 제곱의 합
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
		System.out.print("정수를 입력하세요:");
		count=stdin.nextInt();
		
		while(num!=(count+1)){
			sumWhile+=sumWhile(num);
			num++;
		}
		sumRecursive=sumRecursive(count);
		
		System.out.println("sumWhile 메소드를 사용하여 구한 값은" + sumWhile + "이다.");
		System.out.println("sumRecursive 메소드를 사용하여 구한 값은" + sumRecursive + "이다.");
	}

}
