package pt2.edu;
import pt2.samples.*;

public class PrinterMain {

	public static void main(String[] args) {
		new PrinterController(new SamsungPrinter()).print();
		new PrinterController(new HpPrinter()).print();

	}

}
