package Test9;

public class Cylinder extends Circle{

	double height;
	
	public Cylinder(double x_coordinate , double y_coordinate , double radius,double height){
		
		super(x_coordinate,y_coordinate,radius);
		this.height=height;
	}
	
	public Cylinder(){
		super();
		this.height=0;
	}
	public double getHeight(){
		return height;
	}
	
	public double getSurface(){
		//r^2*3.14*h + 2*3.14*r*h
		return (3.14*radius*radius*2 +2* 3.14*radius*height);
	}
	
	public double getVolume(){
		return 3.14*radius*radius*height;
	}
	
	public void PrintOut(){
		System.out.print("실린더에 대해서 중심 = [" + x_coordinate + "," + y_coordinate + "], 반지름 = " +radius +", 높이 ="
				+ height );
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
