package Test8;

public class Student {
	
	public int index;
	public int registration_number;
	public String name;	

	Student st[];
	public Student(){}
	public Student(int new_number, String new_name){			//持失切 五社球
		setName(new_name);
		setNumber(new_number);
	}

	public String getName(){
		return name;
	}
	
	public int getNumber(){
		return registration_number;
	}
	
	public void setName(String new_name){
		name=new_name;
	}
	
	public void setNumber(int new_number){
		registration_number=new_number;
	}
	
}
