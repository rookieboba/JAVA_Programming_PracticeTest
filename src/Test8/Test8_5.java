package Test8;
import java.util.*;
public class Test8_5 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//5���� �Ǹſ� 
	//������ �����ȣ
		//��ȣ�� ����� �Է¹���
		
		int SalesMan[]= new int[5];					//�Ǹſ�
		int regist_num[]=new int[5];				//���� �����ȣ
		int taken[]= new int[5]; 					//�����
		
		int tmp1,tmp2;
		
		int sum=0;
		int max=0;
		int min=0;
		
		Scanner stdin=new Scanner(System.in);
		
		int num;
		
		for(int i=0;i<SalesMan.length ; i++){
			System.out.print("�Ǹſ��� ��ȣ�� �Է��ϼ���: ");
			num=stdin.nextInt();
			
			//if(regist_num[i]==regist_num[i-1]) break;
			
			System.out.print("�Ǹſ� "+ num + "�� ������� �Է��ϼ���: ");

			taken[num-1]=stdin.nextInt();		//num �� 0�� ������ �迭�� 0 ���� �����ϹǷ� -1 �� ���־�� �Ѵ�.
		}
		
		tmp1=taken[0];
		tmp2=taken[0];
		int min_num =1 ;
		int max_num =1 ;
		
		System.out.println("");
		System.out.println("�Ǹſ����� �����");
		System.out.println("-------------------");
		
		
		for(int i=0;i<SalesMan.length; i++){
			
			System.out.println("�Ǹſ� "+ (i+1) + "                "   + taken[i]);
			
			sum+=taken[i];
			
		// �ִ� ���� ����װ� �����ȣ ���ϱ� 	
			if(taken[i]>tmp1){
				tmp1=taken[i];			
				max_num=i+1;
			}
			max= tmp1;				//�ִ밪 sort
			
			if(taken[i]<tmp2){
				tmp2=taken[i];		 	
				min_num= i+1 ;		//taken[0] ���� �Ǹſ� 1 ,taken[1]���� �Ǹſ� 2,  ..... 
			}
			min= tmp2;				//�ּҰ� sort
		}
		//�߿� 
		
		System.out.println();
		
		System.out.println("�� �����: " +sum);
		System.out.println("��� �����: " + (double) sum/SalesMan.length);
		
		System.out.println("�ִ� �����: "+max + " <��� ��ȣ " + max_num + "> ");
		System.out.println("���� �����: "+min + " <��� ��ȣ " + min_num + "> ");
		
	}

}
