package pt2.testArray;

public class Test10 {

	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		double p = Double.parseDouble(args[2]);
		char[][] map = hide(m, n, p);
		printMap(map, m, n);
		System.out.println();
		printMap(howmany(map, m, n), m, n);

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
