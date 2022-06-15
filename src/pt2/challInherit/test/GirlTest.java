package pt2.challInherit.test;
import pt2.challInherit.samples.*;
public class GirlTest {

	public static void main(String[] args) {
		Girl g1 = new Girl();
		Girl g2 = new GirlGood();
		GirlGood gg = new GirlBest();
		g1.show(); //Girl class에 show 메소드가 없다면 실행 안됨
		g2.show(); //Girl class에 show 메소드가 없다면 실행 안됨
		gg.show();
	}

}