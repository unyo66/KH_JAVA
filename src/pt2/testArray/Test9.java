package pt2.testArray;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		double p = sc.nextDouble();
		char[][] map = hide(m, n, p);
		printMap(map, m, n);
		System.out.println();
		printMap(howmany(map, m, n), m, n);

		sc.close();
	}

	static char[][] hide(int m, int n, double p) {
		char[][] map = new char[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (Math.random() < p) {
					map[i][j] = '*';
				} else
					map[i][j] = '-';
			}
		}

		return map;
	}

	static char[][] howmany(char[][] map, int m, int n) {
		char input = '0';

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == '-') {
					if (i > 0) {
						if (map[i - 1][j] == '*')
							input++;
					}
					if (i < (m - 1)) {
						if (map[i + 1][j] == '*')
							input++;
					}
					if (j > 0) {
						if (map[i][j - 1] == '*')
							input++;
					}
					if (j < (n - 1)) {
						if (map[i][j + 1] == '*')
							input++;
					}

					
					if (i > 0 && j > 0) {
						if (map[i - 1][j - 1] == '*')
							input++;
					}
					if (i > 0 && j < (n - 1)) {
						if (map[i - 1][j + 1] == '*')
							input++;
					}
					if (i < (m - 1) && j > 0) {
						if (map[i + 1][j - 1] == '*')
							input++;
					}
					if (i < (m - 1) && j < (n - 1)) {
						if (map[i + 1][j + 1] == '*')
							input++;
					}
					
					map[i][j] = (char) input;
					input = '0';
				}

			}
		}
		return map;
	}

	static void printMap(char[][] map, int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
