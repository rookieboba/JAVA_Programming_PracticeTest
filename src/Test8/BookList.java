//package Test8;
////Test8_8
//import java.util.*;
//public class BookList {
//
//	int books;							//�������� ��
//	int size;							//��������� ũ��

//	public BookList(int books, int size){
//	
//		//super(Name,Author,Price);
//		this.books=books;
//		this.size=size;
//	
//	}
//	
//		
//	public BookList(){
//		
//		this.books=0;
//		this.size=10;
//	
//	}
//	
////	public void addToCatalogue(String Name, String Author, int Price){
////
////	}
//	
//	public void PrintOut(String Name, String Author, int Price){
//		System.out.println(Name + "             " + Author +  "                    " +Price);
//	}
//	//���� ����� �������� ���� ��������� ũ�⸦ ������
//	//ũ�Ⱑ 10�� �� ��������� �����ϴ� ������ �޼ҵ带 �ۼ��϶� 
//	//������Ͽ� �� ������ �߰��ϴ� addtoCatalogue
//	//�� ���¸� �Ʒ� ��� ��°� ���� ������ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
//	
//	//������Ͽ� �������� �߰��ϰ� ���� ��� ��� ���α׷�
//	//���α׷��� ���� �߰��ϱ� ���ϴ� �� ��ӵǴ� �ݺ����� ��������
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner stdin= new Scanner(System.in);
//		
//		
//	
//		
//		String choose=null;
//		BookList[] books=new BookList[10];
//			
//		int i=0;
//		
//		do{
//			
//			System.out.print("�߰��ϴ� ������ ������, ���ڿ� ������ �Է��ϼ���: ");
//			books[i].Name=stdin.next();
//			books[i].Author=stdin.next();
//			books[i].Price=stdin.nextInt();
//			System.out.print("�߰��� ������ �ֽ��ϱ�<�� Ȥ�� �ƴϿ�>:");
//	
//			choose=stdin.next();
//			i++;
//		}while(!choose.equals("�ƴϿ�"));
//		
//
//		System.out.println();
//		System.out.println("�������");
//		System.out.println("-------");
//		System.out.println();
//		System.out.println("������                      ����                ����");
//		for(int j=0;j<books.length;j++){
//			books[j].PrintOut(Book.Name,Book.Author,Book.Price);
//		}
//	}
//
//}
