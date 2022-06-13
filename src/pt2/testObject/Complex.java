package pt2.testObject;

public class Complex {
	double n, i;
	double[] dArray;

	public Complex(double... dArray) {
		this.dArray = dArray;
	}

	public void print() {
		int i = 0;

		if (dArray.length < 2) {
			System.out.println(dArray[0] + " + 0.0i");
		} else {
			while (i < dArray.length - 1) {
				System.out.print(dArray[i] + " + ");
				i++;
			}
			System.out.println(dArray[i] + "i");
		}

	}
}
