
public class Zadanie4 {

	public static void main(String[] args) {
		int[][] mas = new int[5][8];
		int max = -100;
		for (int i = 0; i<5; i++)
		{
			for (int j = 0; j<8; j++)
			{
				mas[i][j] = (int) (-99 + Math.random()*199);
				if (mas[i][j] > max)
					max = mas[i][j];
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Максимальный элемент массива:" + max);
	}

}
