package Test9_1;

public class MonetaryCoin extends Coin{

	public int amount;

	public MonetaryCoin(int plane,  int amount){
		
		super(plane);
		this.amount=amount;			//��

	}
	public int setValue(){
		return amount;
	}

}
