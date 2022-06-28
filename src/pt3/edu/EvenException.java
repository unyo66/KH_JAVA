package pt3.edu;

public class EvenException extends Exception {
	private Integer number = null;
	
	public EvenException(int n)
	{
		this.number = n;
	}
	
	@Override
	public String getMessage()
	{
		if (number == null)
		{
			return "숫자가 아닙니다";
		}
		else
		{
			return Integer.toString(number) + "는 짝수가 아닙니다.";
		}
	}
}
