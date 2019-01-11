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
			System.out.println("���κκп��� ũ�Ⱑ �߸� �Ǿ����ϴ�.");
	}
	
	void setHeight(int height){
		this.height=height;
		if((height<0)||(height>20))
			
			System.out.println("���κκп��� ũ�Ⱑ �߸� �Ǿ����ϴ�.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Rectangle Driver = new Rectangle();
		Driver.setWidth(3);
		Driver.setHeight(5);
		System.out.print("���簢��  ������ ���̴� " + Driver.getWidth() + "\n" +
				"���簢�� ������ ���̴� " + Driver.getHeight() +	"\n" +
					"���簢�� �ѷ��� " + Driver.getPerimeter()+	"\n" +
						"���簢�� ���̴� " + Driver.getArea());
	}

}
