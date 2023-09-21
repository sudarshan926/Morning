package arays__;

public class single_arays {

	public static void main(String[] args) {
		System.out.println("using for loop");
		int[][] a = new int[][] { { 1, 2, 3 }, { 3, 2, 1 }, { 5, 3, 2 }, };
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				System.out.print(a[i][j] + ",");

			}

		}
	}
}