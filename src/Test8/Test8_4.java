package Test8;
import java.util.*;

public class Test8_4 {

	public static void main(String[] args) {
	
		Scanner stdin=new Scanner(System.in);
		int quest; //���� �� 
		
		System.out.print("���� ���� �Է��ϼ���: ");
		quest=stdin.nextInt();
	
		String[] Ans=new String[quest];			//���� ������ ��
		String[] Correct=new String[quest];		//����
		int result=0;							//���� ��� �ʱ�ȭ
		double score=0;							//���� �ʱ�ȭ
		
		System.out.print("������ �Է��ϼ���: ");
		
		for(int i=0; i<Ans.length; i++){
			Ans[i]=stdin.next();
		}
		System.out.print("���� �Է��ϼ���: ");
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
		
		System.out.println("���� ���: " + result);
		System.out.println("����: " + score);
		System.out.print("ä���� ��� �� �ִ°�? y Ȥ�� n �� �Է��ϼ���: ");
		check=stdin.next();
	}


}
