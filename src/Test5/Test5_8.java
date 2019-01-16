package Test5;

import java.util.*;

public class Test5_8 {
	
	public static int DecToOctWhile(int dec){
		
		int octal=0, count=0;
		int deccopy=dec;
		int sum=0;
		
		
		while(dec>1){	//몇자리 수인지 계산

			dec=dec/8;	//자연수를 8로 나눈 후 floor 를 하여 소수점이 버려졌기 때문에 8의 제곱수를 곱한다 해도 원래의 값을 되찾지는 못함
			count++;
		}
		dec=deccopy;	//임시로 마련해 둔 원래의 dec 값
		
		int arr[]=new int[count];	
		int i=0;

		while(dec>1){
			arr[count-1-i]=dec%8;
			dec=dec/8;
			sum+=pow(10,i)*arr[count-i-1];
			i++;
		}
		//역배열;;;

		return sum;
	}



	private static int pow(int i, int count) {
		// TODO Auto-generated method stub
		int sum=1;
		for(int n=1;n<=count;n++){
			sum*=i;
		}
		return sum;
	}


/*
	public static int DecToOctRecursive(int dec){
		
		
		int sum=0,count=0;
		int deccopy=dec;
		
		if (dec<8) return dec;
		
			
		while(dec>8){
			count++;
			dec=dec/8;
		}	

		dec=deccopy;
		int a= dec%8;
		
		sum=a* pow(10,arr[count]-1);
		
		
		return sum+ DecToOctRecursive(dec/8);
	}
*/	

	public static void main(String[] args) {
		
	
		int num;
		System.out.print("자연수를 입력하시오:");
		Scanner stdin= new Scanner (System.in);
		
		num=stdin.nextInt();
		
		System.out.println("함수 DecToOctWhile 를 이용하여 10진수" + num + "을 8진수로 바꾸면 " + DecToOctWhile(num) +"이다.");
		//System.out.println("함수 DecToOctRecursive 를 이용하여 10진수" + num + "을 8진수로 바꾸면 " + DecToOctRecursive(num) +"이다.");
	}

}
