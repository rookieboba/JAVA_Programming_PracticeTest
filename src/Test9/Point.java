package Test9;


public class Point {

	double x_coordinate;
	double y_coordinate;

	public Point(double x_coordinate, double y_coordinate) {

		this.x_coordinate = x_coordinate;
		this.y_coordinate = y_coordinate;

	}

	public Point() {
		this.x_coordinate = 0;
		this.y_coordinate = 0;
	}

	public double x_return() {
		return x_coordinate;
	}

	public double y_return() {
		return y_coordinate;
	}

	public double x_coordinate(double x) {
		return x;
	}

	public double y_coordinate(double y) {
		return y;
	}

	public void PrintOut(){

		System.out.print("���� ���ؼ��� ��ǥ [" + x_coordinate(x_coordinate) + " , " + y_coordinate(y_coordinate) + "]");
	}
	
}
