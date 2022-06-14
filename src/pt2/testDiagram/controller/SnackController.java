package pt2.testDiagram.controller;
import pt2.testDiagram.model.Snack;
public class SnackController {
	private Snack sn = new Snack();
	public SnackController()
	{

	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price)
	{
		sn.setKind(kind);
		sn.setName(name);
		sn.setFlavor(flavor);
		sn.setNumOf(numOf);
		sn.setPrice(price);
		return "저장 완료";
	}
	
	public String confirmData(int n)
	{
			return sn.information(n);
	}
}
