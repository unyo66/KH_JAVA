package pt2.testAbstract;

import java.util.Scanner;

abstract class Echoer {
	void start() {
		System.out.println("시작합니다.");
	}

	abstract void echo();

	void stop() {
		System.out.println("종료합니다.");
	}
}

public class Test8Echoer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Echoer e = new Echoer() {

			void echo() {
				while (true)
				{
					String out = sc.next();
					System.out.println(out);
					if (out.equals("끝"))
						break;
				}
			}

		};
		e.start();
		e.echo();
		e.stop();

	}

}
