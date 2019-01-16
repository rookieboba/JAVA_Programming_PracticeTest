package Test9;

public class Driver extends Cylinder{

	public Driver(double x_coordinate, double y_coordinate, double radius, double height) {
		super(x_coordinate, y_coordinate, radius, height);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		
		Point pt[]=new Point[3];
		Circle cr[]=new Circle[3];
		Cylinder cl[]=new Cylinder[3];
		
	
		pt[0]=new Point();
		cr[0]=new Circle();
		cl[0]=new Cylinder();
		
		pt[0].x_coordinate=7.2; 
		pt[0].y_coordinate=11.5;
	
		
		cr[0].x_coordinate=3.7;
		cr[0].y_coordinate=4.3;
		cr[0].radius=2.5;
		
		
		cl[0].x_coordinate=1.2;
		cl[0].y_coordinate=2.3;
		cl[0].radius=2.5;
		cl[0].height=5.7;
	
		
		pt[0].PrintOut();
		System.out.println();
		System.out.println();
		cr[0].PrintOut();
		System.out.println();
		System.out.println("원의 면적              "+ cr[0].getArea());
		System.out.println();
		cl[0].PrintOut();
		System.out.println();
		System.out.println("실린더의 표면적과 부피" + " " +   cl[0].getSurface() +" , " +cl[0].getVolume());
		System.out.println();
	}

}
