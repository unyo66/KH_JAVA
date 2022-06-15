package pt2.testAbstract;

public class Test4Test {
	static void speak(Test4Korean t)
	{
		t.talk();
	}
	static void speak(Test4American t)
	{
		t.talk();
	}

	public static void main(String[] args) {
		speak(new Test4Korean());
		speak(new Test4American());
	}

}
