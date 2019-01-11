package Test6;

public class Employee {

	String Name;						//이름
	int Resident_registration_number;	//주민등록번호
	String Company_Position;						//직위
	int Payment_per_hour;				//시간당 임금
	int Work_time;						//일한 시간
	
	int Payment(int Work_time){
		if(Work_time>=40)	return (int) (this.Payment_per_hour *1.5 * 8 * 31);		//1시간 급여 * 8시간 *  31일
		else return ( this.Payment_per_hour * 8 * 31 );
	}
	
	void Changed_Amount(int Change_per_hour){
		if(Change_per_hour > this.Payment_per_hour)
			System.out.println("증감액만큼 증액 또는 감액할 수 없다.");
		else
			this.Payment_per_hour+=Change_per_hour;
	
	}
	
	public Employee(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee em = new Employee();
		em.Name="박성빈";
		em.Company_Position="대표";
		em.Payment_per_hour=10000;
		em.Resident_registration_number=951015;
		em.Work_time=50;
	
		System.out.print("나의 이름은 " + em.Name + "\n" +
		
				"나의 직위는 " + em.Company_Position + "\n" +
				
				"나의 시간당 급여는 " + em.Payment_per_hour + "원\n" +
				
				"나의 주민등록번호 앞자리는 " + em.Resident_registration_number + "\n" +
				
				"나의 일한 시간은 " + em.Work_time + "시간\n" +
				
				"나의 월급은 "+ em.Payment(em.Work_time) +"원\n" );
	}

}
