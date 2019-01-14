//package Test8;
////Test8_8
//import java.util.*;
//public class BookList {
//
//	int books;							//도서들의 수
//	int size;							//도서목록의 크기

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
//	//도서 목록은 도서들의 수와 도서목록의 크기를 가진다
//	//크기가 10인 빈 도서목록을 생성하는 생성자 메소드를 작성하라 
//	//도서목록에 한 도서를 추가하는 addtoCatalogue
//	//현 상태를 아래 모범 출력과 같은 형태의 문자열로 반환하는 메소드
//	
//	//도서목록에 도서들을 추가하고 도서 목록 출력 프로그램
//	//프로그램은 도서 추가하기 원하는 한 계속되는 반복문을 가져야함
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
//			System.out.print("추가하는 도서의 도서명, 저자와 가격을 입력하세요: ");
//			books[i].Name=stdin.next();
//			books[i].Author=stdin.next();
//			books[i].Price=stdin.nextInt();
//			System.out.print("추가할 도서가 있습니까<예 혹은 아니오>:");
//	
//			choose=stdin.next();
//			i++;
//		}while(!choose.equals("아니오"));
//		
//
//		System.out.println();
//		System.out.println("도서목록");
//		System.out.println("-------");
//		System.out.println();
//		System.out.println("도서명                      저자                가격");
//		for(int j=0;j<books.length;j++){
//			books[j].PrintOut(Book.Name,Book.Author,Book.Price);
//		}
//	}
//
//}
