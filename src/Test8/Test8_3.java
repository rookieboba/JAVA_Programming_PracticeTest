package Test8;
import java.util.*;

public class Test8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdin=new Scanner(System.in);
		
		int count;
		
		
		System.out.print("���� ���� �Է��ϼ���: ");
		count=stdin.nextInt();
		
		int Question[]=new int[count];
		int Answer[]=new int[count];
		int temp1[]=new int[count];
		int temp2[]=new int[count];
		double score=0;
		int correct=0;
		System.out.print("������ �Է��ϼ���: ");
		
		for(int i=0; i<Question.length;i++){
			temp1[i]=stdin.nextInt();
		}
		System.out.print("���� �Է��ϼ���: ");
		
		for(int i=0; i<Answer.length;i++){
			temp2[i]=stdin.nextInt();
		}
		
		for(int i=0;i<count;i++){
			if(temp1[i]==temp2[i]){
				correct+=1;
				score+=10.0;
			}
		}
		System.out.println("���� ���:" +correct);
		System.out.print("����: " +score);
		
	}

}
