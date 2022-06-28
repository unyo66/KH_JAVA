package pt3.GenericChall;



public class ScoreTest {
	
	static <T> T findScore(T[] a, String name)
	{
		EnglishScore error = new EnglishScore("인자가 없습니다.", 0);
		for (T e : a)
		{
			if (e.toString().substring(0, 3).equals(name))
				return e;
		}
		return (T) error;
	}
	
	static <T extends Comparable<T>> T findBest(T[] a) 
	{
		T best = a[0];
		for (T e : a)
		{
			
			if ((e.compareTo(best) > 0))
				best = e;
			
		}
		return best;
	}

	public static void main(String[] args) {
		EnglishScore[] ea = {new EnglishScore("김삿갓", 77),new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99)};
		System.out.println("영어 최고 점수 : " + findBest(ea));
		MathScore[] ma = {new MathScore("김삿갓", 77),new MathScore("장영실", 100), new MathScore("홍길동", 99)};
		System.out.println("수학 최고 점수 : " + findBest(ma));
		System.out.println("영어     점수 : " + findScore(ea, "장영실"));
		System.out.println("수학     점수 : " + findScore(ma, "김삿갓"));
		System.out.println("수학     점수 : " + findScore(ma, "김갓"));



	}

}
