package Test9_1;

import java.util.*;
//head and tails 

public class Coin {

	public int plane;
	static Random random=new Random();
	public Coin(int plane) {
		this.plane = plane;
	}

	public int setRand() {
		int plane = random.nextInt(2);
		return plane;
		//return 1;
	}

	public String getPlane(int plane) { // ¾Õ¸é ¶Ç´Â µÞ¸é
		if (plane % 2 == 0)
			return "¾Õ¸é";
		else 
			return "µÞ¸é";
	}

}