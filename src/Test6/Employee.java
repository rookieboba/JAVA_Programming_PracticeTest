package Test6;

public class Employee {

	String Name;						//�̸�
	int Resident_registration_number;	//�ֹε�Ϲ�ȣ
	String Company_Position;						//����
	int Payment_per_hour;				//�ð��� �ӱ�
	int Work_time;						//���� �ð�
	
	int Payment(int Work_time){
		if(Work_time>=40)	return (int) (this.Payment_per_hour *1.5 * 8 * 31);		//1�ð� �޿� * 8�ð� *  31��
		else return ( this.Payment_per_hour * 8 * 31 );
	}
	
	void Changed_Amount(int Change_per_hour){
		if(Change_per_hour > this.Payment_per_hour)
			System.out.println("�����׸�ŭ ���� �Ǵ� ������ �� ����.");
		else
			this.Payment_per_hour+=Change_per_hour;
	
	}
	
	public Employee(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee em = new Employee();
		em.Name="�ڼ���";
		em.Company_Position="��ǥ";
		em.Payment_per_hour=10000;
		em.Resident_registration_number=951015;
		em.Work_time=50;
	
		System.out.print("���� �̸��� " + em.Name + "\n" +
		
				"���� ������ " + em.Company_Position + "\n" +
				
				"���� �ð��� �޿��� " + em.Payment_per_hour + "��\n" +
				
				"���� �ֹε�Ϲ�ȣ ���ڸ��� " + em.Resident_registration_number + "\n" +
				
				"���� ���� �ð��� " + em.Work_time + "�ð�\n" +
				
				"���� ������ "+ em.Payment(em.Work_time) +"��\n" );
	}

}
