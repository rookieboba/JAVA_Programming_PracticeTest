package Test6;

//Test6_1 && 6_2

import java.util.Scanner;
public class Name {
	
		String FirstName;
		String LastName;
	public Name(){
		
	}
	
	String getLastName(String LastName){
		return LastName;
	}
	
	String getFirstName(String FirstName){
		return FirstName;
	}
	
	int NumCount(String FirstName,String LastName){
		return (FirstName.length() + LastName.length());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Name Driver =new Name();
		
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		Scanner stdin=new Scanner(System.in);
		String FirstName=stdin.nextLine();
		Driver.getFirstName(FirstName);
		
		System.out.print("���� �Է��Ͻÿ�: ");
		String LastName=stdin.nextLine();
		Driver.getFirstName(LastName);
		
		System.out.println("");
		System.out.println("������ ���̴�" + Driver.NumCount(FirstName, LastName) +"�Դϴ�.\n");
	}

}
