package Test8;
import java.util.*;

public class Test8_4 {

	public static void main(String[] args) {
	
		Scanner stdin=new Scanner(System.in);
		int quest; //문제 수 
		
		System.out.print("문제 수를 입력하세요: ");
		quest=stdin.nextInt();
	
		String[] Ans=new String[quest];			//내가 제출한 답
		String[] Correct=new String[quest];		//정답
		int result=0;							//맞은 답수 초기화
		double score=0;							//점수 초기화
		
		System.out.print("정답을 입력하세요: ");
		
		for(int i=0; i<Ans.length; i++){
			Ans[i]=stdin.next();
		}
		System.out.print("답을 입력하세요: ");
		for(int i=0; i<Correct.length; i++){
			Correct[i]=stdin.next();
		}
		
		for(int i=0; i< quest ; i++){
			if(Ans[i].equals(Correct[i])){
				result+=1;
				score+=1;
			}
			else 
				score-=0.2;
		}
		String check;
		
		System.out.println("맞은 답수: " + result);
		System.out.println("점수: " + score);
		System.out.print("채점할 퀴즈가 더 있는가? y 혹은 n 을 입력하세요: ");
		check=stdin.next();
	}


}
