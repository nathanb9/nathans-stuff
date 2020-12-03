package crap;

import java.util.Random;
public class Die {

	private int val;
	public void roll(){
		Random r = new Random();
		val  = r.nextInt(6)+1;
	}
	public int getNumDots() {
		return val;
	}

}
