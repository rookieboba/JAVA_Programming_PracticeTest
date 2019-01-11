package Test8;
import java.util.*;
public class Test8_5 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//5명의 판매원 
	//고유한 사원번호
		//번호와 매출액 입력받음
		
		int SalesMan[]= new int[5];					//판매원
		int regist_num[]=new int[5];				//고유 사원번호
		int taken[]= new int[5]; 					//매출액
		
		int tmp1,tmp2;
		
		int sum=0;
		int max=0;
		int min=0;
		
		Scanner stdin=new Scanner(System.in);
		
		int num;
		
		for(int i=0;i<SalesMan.length ; i++){
			System.out.print("판매원의 번호를 입력하세요: ");
			num=stdin.nextInt();
			
			//if(regist_num[i]==regist_num[i-1]) break;
			
			System.out.print("판매원 "+ num + "의 매출액을 입력하세요: ");

			taken[num-1]=stdin.nextInt();		//num 은 0은 없지만 배열은 0 부터 저장하므로 -1 을 해주어야 한다.
		}
		
		tmp1=taken[0];
		tmp2=taken[0];
		int min_num =1 ;
		int max_num =1 ;
		
		System.out.println("");
		System.out.println("판매원들의 매출액");
		System.out.println("-------------------");
		
		
		for(int i=0;i<SalesMan.length; i++){
			
			System.out.println("판매원 "+ (i+1) + "                "   + taken[i]);
			
			sum+=taken[i];
			
		// 최대 최저 매출액과 사원번호 구하기 	
			if(taken[i]>tmp1){
				tmp1=taken[i];			
				max_num=i+1;
			}
			max= tmp1;				//최대값 sort
			
			if(taken[i]<tmp2){
				tmp2=taken[i];		 	
				min_num= i+1 ;		//taken[0] 에는 판매원 1 ,taken[1]에는 판매원 2,  ..... 
			}
			min= tmp2;				//최소값 sort
		}
		//중요 
		
		System.out.println();
		
		System.out.println("총 매출액: " +sum);
		System.out.println("평균 매출액: " + (double) sum/SalesMan.length);
		
		System.out.println("최대 매출액: "+max + " <사원 번호 " + max_num + "> ");
		System.out.println("최저 매출액: "+min + " <사원 번호 " + min_num + "> ");
		
	}

}
