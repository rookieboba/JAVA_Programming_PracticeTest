package Test6;


//Test6_1 && 6_2


public class Rectangle {

	private int width;
	private int height;
	
	public Rectangle(){
		int width=1;
		int height=1;
	}
	
	int getPerimeter(){
		return 2*(width+height);
	}	
	
	int getArea(){
		return width*height;
	}
	
	int getWidth(){
		return width;
	}
	
	int getHeight(){
		return height;
	}
	
	void setWidth(int width){
		this.width=width;
		if((width<0)||(width>20))
			System.out.println("가로부분에서 크기가 잘못 되었습니다.");
	}
	
	void setHeight(int height){
		this.height=height;
		if((height<0)||(height>20))
			
			System.out.println("세로부분에서 크기가 잘못 되었습니다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Rectangle Driver = new Rectangle();
		Driver.setWidth(3);
		Driver.setHeight(5);
		System.out.print("직사각형  가로의 길이는 " + Driver.getWidth() + "\n" +
				"직사각형 세로의 길이는 " + Driver.getHeight() +	"\n" +
					"직사각형 둘레는 " + Driver.getPerimeter()+	"\n" +
						"직사각형 넓이는 " + Driver.getArea());
	}

}
