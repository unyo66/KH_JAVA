package pt2.challInherit.test;
import pt2.challInherit.samples.*;
public class GirlTest {

	public static void main(String[] args) {
		Girl g1 = new Girl();
		Girl g2 = new GirlGood();
		GirlGood gg = new GirlBest();
		g1.show();
		g2.show(); 
		gg.show();
	}

}
