package Test6;

public class SavingAccount {

	private double rate;
	int balance;	//���� �ܰ�		
	int interest;	//���� ����
	
	public SavingAccount(){
	
	}
	
	void setRate(double rate){ 									//���� ����
		this.rate=(1+ rate/100);
	}
	void setBalance(int balance){								//�ܰ� ���
		this.balance=balance;
	}
	
	int getTotal(){
		return (int)(this.rate * this.balance);					//���� �ݾ�
	}
	int getInterest(){											//���� ����
		return (int) (this.rate * this.balance -this.balance);	//���� �ݾ�	-	���� �ݾ�
	}
	
	//this.balance -> ���� �ݾ�
	//return getInterest -> ���ڸ�
	//this.rate -> ����
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount Driver1=new SavingAccount();
		
		Driver1.setRate(5);
		Driver1.setBalance(10000);

		SavingAccount Driver2=new SavingAccount();
		Driver2.setRate(5);
		Driver2.setBalance(20000);

		
		System.out.println("Driver1 �� ���ڴ� " + Driver1.getInterest() +"�� �Դϴ�.");
		System.out.println("Driver2 �� ���ڴ� " + Driver2.getInterest() +"�� �Դϴ�.");

		
		Driver1.setRate(6);
		Driver2.setRate(6);
		
		Driver1.setBalance(Driver1.getTotal());
		Driver2.setBalance(Driver2.getTotal());
		
		System.out.println("�ι�° ����");
		System.out.println("Driver1 �� ���ڴ� " + Driver1.getInterest() +"�� �Դϴ�.");
		System.out.println("Driver2 �� ���ڴ� " + Driver2.getInterest() +"�� �Դϴ�.");

	}

}
