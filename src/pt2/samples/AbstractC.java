package pt2.samples;

public class AbstractC extends AbstractP {
	private String subject;
	
	public AbstractC()
	{
		super();
	}
	
	public AbstractC(String subject)
	{
		super();
		this.subject = subject;
	}
	
	public AbstractC(String name, String subject)
	{
		super(name);
		this.subject = subject;
	}
	
	@Override
	public void out()
	{
		System.out.println(getName() + " 학생입니다");
		System.out.println(subject + "를 수강합니다");
	}
}
