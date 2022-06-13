package pt2.edu;
import pt2.samples.*;
public class TestPoly {

	public static void main(String[] args) {
		Child3 c = new Child3();
		c.display();
		c.out();
		
		System.out.println();
		Parent3 p = new Child3();
//		p.out();
		p.display();
		p.hi();
	}

}
