package pt2.testAbstract;

interface Flyable
{
	void speed();
	void height();
}

public class Test7FlyableTest {

	public static void main(String[] args) {
		Flyable f = new Flyable(){
			
			public void speed() 
			{
				System.out.println("속도");
			}
			public void height() 
			{
				System.out.println("높이");
			}
		};
		f.speed();
		f.height();
	}

}
