package Test6;

public class SavingAccount {

	private double rate;
	int balance;	//현재 잔고		
	int interest;	//월별 이자
	
	public SavingAccount(){
	
	}
	
	void setRate(double rate){ 									//연간 이율
		this.rate=(1+ rate/100);
	}
	void setBalance(int balance){								//잔고 계산
		this.balance=balance;
	}
	
	int getTotal(){
		return (int)(this.rate * this.balance);					//최종 금액
	}
	int getInterest(){											//월별 이자
		return (int) (this.rate * this.balance -this.balance);	//최종 금액	-	원래 금액
	}
	
	//this.balance -> 원래 금액
	//return getInterest -> 이자만
	//this.rate -> 이율
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount Driver1=new SavingAccount();
		
		Driver1.setRate(5);
		Driver1.setBalance(10000);

		SavingAccount Driver2=new SavingAccount();
		Driver2.setRate(5);
		Driver2.setBalance(20000);

		
		System.out.println("Driver1 의 이자는 " + Driver1.getInterest() +"원 입니다.");
		System.out.println("Driver2 의 이자는 " + Driver2.getInterest() +"원 입니다.");

		
		Driver1.setRate(6);
		Driver2.setRate(6);
		
		Driver1.setBalance(Driver1.getTotal());
		Driver2.setBalance(Driver2.getTotal());
		
		System.out.println("두번째 달의");
		System.out.println("Driver1 의 이자는 " + Driver1.getInterest() +"원 입니다.");
		System.out.println("Driver2 의 이자는 " + Driver2.getInterest() +"원 입니다.");

	}

}
