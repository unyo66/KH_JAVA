package pt2.testDiagram.model;

public class Snack {
	private String kind, name, flavor;
	private int numOf, price;

	public Snack()
	{
		
	}
	
	public Snack(String kind, String name, String flavor, int numOf, int price)
	{
		
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getKind() {
		return kind;
	}
	public String getName() {
		return name;
	}
	public String getFlavor() {
		return flavor;
	}
	public int getNumOf() {
		return numOf;
	}
	public int getPrice() {
		return price;
	}
	
	public String information(int n)
	{
		switch(n)
		{
		case 0 : return this.getKind();
		case 1 : return this.getName();
		case 2 : return this.getFlavor();
		case 3 : return String.valueOf(this.getNumOf());
		default : return String.valueOf(this.getPrice());
		}
	}
	
	
}
