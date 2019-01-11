package Test6;
//Test6_3 && 6_4
public class Circle {

	private int radius;

	public Circle(){
		
		int radius;				//	반지름
		double area;			//	면적
		double perimeter;		//	둘레
	}
	
	void getRadius(int radius){
		this.radius=radius;
	}
	
	double getArea(int radius){
		return 3.14 * radius * radius;
	}

	double getPerimeter (int radius){
		return 3.14 * 2 * radius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Circle Driver=new Circle();
		Driver.getRadius(5);
		System.out.print(" 원의 면적은 " + Driver.getArea(Driver.radius) +
							" 둘레는 "+ Driver.getPerimeter(Driver.radius) + "입니다.");
		
	
	}

}
