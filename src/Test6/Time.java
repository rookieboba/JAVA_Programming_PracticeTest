package Test6;

public class Time {

	int hour;
	int minute;
	int second;
	
	int setHour(){
		return hour;
	}
	
	int setMinute(){
		return minute;
	}
	
	int setSecond(){
		return second;
	}
	
	void getHour(){
		System.out.print(setHour()+"�� ");
	}

	void getMinute(){
		System.out.print(setMinute()+"�� ");
	}

	void getSecond(){
		System.out.print( setSecond() +"�� ");
	}
	
	void getTime(){
		System.out.print("���� �ð��� ");
	}
	void Correct(int hour,int minute , int second){
		
		this.hour +=hour;
		this.minute += minute;
		this.second += second;
		
		do{								//�ð� �� �� ���� 
			if(hour>=24) this.hour-=24;
			
			else if (hour<=-24) this.hour +=24;
			
			else if(minute>=60) { 
				this.minute = this.minute-60; 
				this.hour+=1;			
			}
			else if(minute<0){
				this.minute= this.minute+60;
				this.hour-=1;
			}
			
			else if(second>=60){
				this.second = this.second-60;
				this.minute+=1; 
			}
			else if(second<0){
				this.second = this.second+60;
				this.minute-=1;
			}
			}while ((this.hour>=24 || this.hour<=0)  || (this.minute>=60 || this.minute<0) || (this.second>=60 || this.second<0));
			
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time time=new Time();
		time.hour=4;
		time.minute=25;
		time.second=16;
		
		System.out.println();
		//�ð� ���
		time.getTime();
		time.getHour();
		time.getMinute();
		time.getSecond();
		
		time.Correct(4, 22, 66);
		
		time.getTime();
		time.getHour();
		time.getMinute();
		time.getSecond();
	}

}
