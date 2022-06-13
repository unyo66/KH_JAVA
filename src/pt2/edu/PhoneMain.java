package pt2.edu;
import pt2.samples.*;
public class PhoneMain {

	public static void main(String[] args) {
		IPhone iPhone = new IPhone("7", "010-xxxx-xxxx", 32);
		GPhone gPhone = new GPhone("Vega", "010-yyyy-yyyy");
		System.out.println(iPhone.getModel() + ", " + iPhone.getNumber() + ", " + iPhone.getMemorySize());
		System.out.println(gPhone.getModel() + ", " + gPhone.getNumber() + ", " + gPhone.getOs());
	}

}
