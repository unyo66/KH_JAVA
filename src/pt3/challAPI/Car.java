package pt3.challAPI;

public class Car {
	private String model;
	private String driver = "홍길동";

	public Car()
	{
		
	}
	
	public Car(String str)
	{
		this.model = str;
	}
	
	public void setModel(String str)
	{
		this.model = str;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setDriver(String str)
	{
		this.driver = str;
	}
	
	public String getDriver()
	{
		return driver;
	}
	
	public boolean equals(Object o)
	{
		if (this.model.equals(((Car)o).model))
		{
			return true;
		}
		else
			return false;
	}
	
//	public String toString()
//	{
//		
//	}

}
