package pt2.test2.test;
import pt2.test2.samples.*;

public class PrinterTest
{
	public static void main(String[] args)
	{
		Printer p = new Printer(100);
		p.print(30);
		p.print(30);
		p.print(30);
		p.print(30);
		p.print(30);
		p.addPaper(40);
		p.print(30);
		p.addPaper(10);
	}
}