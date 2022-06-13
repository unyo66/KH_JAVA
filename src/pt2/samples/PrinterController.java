package pt2.samples;

public class PrinterController {
	private PrintDriver print;
	
	public PrinterController(PrintDriver print)
	{
		this.print = print;
	}
	
	public void print()
	{
		print.print();
		print.test();
	}
}
