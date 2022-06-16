package pt3.edu;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random rd = new Random();
		
		System.out.println(rd.nextInt());//최소~최대
		System.out.println(rd.nextInt(10));//0~9
		System.out.println(rd.nextInt(10) + 1);//1~10
		System.out.println(rd.nextBoolean());
		System.out.println(rd.nextDouble());
	}

}
