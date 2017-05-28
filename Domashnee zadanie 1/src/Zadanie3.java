public class Zadanie3 {

	public static void main(String[] args) {
		int[][] mas = new int[8][6];
		for (int i = 0; i<8; i++)
		{
			for (int j = 0; j<5; j++)
			{
				mas[i][j] = (int) (10+Math.random()*90);
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}

}
