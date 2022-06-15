package pt2.testInherit;

public class PointTest {

	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		MovablePoint p2 = new MovablePoint(1, 2, 30, 40);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
