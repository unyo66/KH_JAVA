package pt2.testAbstract;

class Worker implements Test6Human
{
	public void print()
	{
		System.out.println("인간입니다.");
	}
	
	public void eat()
	{
		System.out.println("빵을 먹습니다.");
	}
}

class Student implements Test6Human
{
	int age;
	public Student()
	{
		
	}
	
	public Student(int n)
	{
		this.age = n;
	}
	
	public void print()
	{
		System.out.println(age + "세의 학생입니다.");
	}
	
	public void eat()
	{
		System.out.println("도시락을 먹습니다.");
	}
}


public class Test6HumanTest {

	public static void main(String[] args) {
		Test6Human.echo();
		
		Student s = new Student(20);
		s.print();
		s.eat();
		
		Test6Human p = new Worker();
		p.print();
		p.eat();
	}

}
