package pt3.edu;
import java.io.*;
import java.util.*;

public class PpManager {

	private ArrayList<PpStudent> list = new ArrayList<PpStudent>();
	private Properties prop = new Properties();
	
	public PpManager()
	{
		
	}
	
	public void propertyInsert(PpStudent st)
	{
		prop.setProperty(st.getNo(), st.toString());
		System.out.println(st.getName() + " 학생의 데이터 삽입 성공!");
	}
	
	public void propertyStore()
	{
		try {
			prop.store(new FileWriter(new File("prop.properties")), "Ex_Student.properties");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void propertyPrint()
	{
		try {
			prop.load(new FileReader(new File("prop.properties")));
			for (int i = 1; i <= prop.size(); i++)
			{
				String index = String.valueOf(i);
				list.add(parseStudent(prop.getProperty(index)));
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		for (PpStudent e : list)
		{
			System.out.println(e);
		}
		System.out.println("학생 데이터 출력이 완료되었습니다.");
	}
	
	public PpStudent parseStudent(String str)
	{
		String tmp[] = str.split(", ");
		return new PpStudent(tmp[0], tmp[1], Integer.parseInt(tmp[2]));
	}
	
	
	


}
