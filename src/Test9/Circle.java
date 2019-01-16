package Test9;

public class Circle extends Point{

	double radius;
	
	public Circle(double x_coordinate , double y_coordinate , double radius){
		super(x_coordinate,y_coordinate);
		this.radius=radius;
	}
	
	public Circle(){
		super();
		this.radius=0;
	}
	public double getRadius(double radius){

		return radius;
	}
	
	public double getArea(){
		return radius * radius *3.14;
	}
	
	public void PrintOut(){
		System.out.print("원에 대해서는 중심=[" + x_coordinate +"," + y_coordinate +"], 반지름 = "+ radius);
		
	}
	
}
