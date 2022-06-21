package pt3.edu;

interface Negative
{
	int neg(int x);
}

interface Printable
{
	void print();
}

public class Lambda2Demo {

	public static void main(String[] args) {
		
		Negative n;
		n = x -> -x;
		System.out.println(n.neg(1));
		
		Printable p;
		p = () -> System.out.println("안녕!");
		p.print();
	}

}
