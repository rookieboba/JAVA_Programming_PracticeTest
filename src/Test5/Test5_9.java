package Test5;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test5_9 {

	public static void reverseDoWhile(String arr[]){
		
		int count=arr.length;
		int i=0;
		
		do{
			System.out.print(arr[count-i-1]);
			i++;
		}while((count-i-1)>=0);
	}
	
	public static String reverseRecursive(String arr[], int i){
		
		int count=arr.length;
		return arr[count-i-1] + reverseRecursive(arr,i-1); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner stdin=new Scanner(System.in);
		System.out.print("문자열을 입력하세요:" );
		
		
		String arr=stdin.nextLine();
	
		for(int i=arr.length()-1 ; i >=0 ; i--){
			System.out.print(arr.charAt(i));
		}
	}
}
