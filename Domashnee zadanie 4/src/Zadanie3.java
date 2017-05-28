
public class Zadanie3 {
	public static void main(String[] args) {
		int[][] mas = new int[5][5];
		for (int i = 0; i<5; i++)
		{
			for (int j = 0; j<5; j++)
			{
				if (i==0 && j==0)
					mas[i][j] = (int) (Math.random()*10);
				else if (j==0)
					mas[i][j] = (int) (Math.random()*10) + mas[i-1][4];
				else mas[i][j] = (int) (Math.random()*10) + mas[i][j-1];
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
			
			
		}

		int num = mas[(int) ((Math.random()*4))][(int) ((Math.random()*4))];
		System.out.println("Число, которое нужно найти: " + num);
		
		int i,j,f = 0,posmin=0,posmax=24,pos = 12;
		while(f==0) {
			i = pos/5;
			j = pos%5;
			if (mas[i][j] == num) {
				System.out.println("Строка "+(i+1)+" Столбец "+(j+1));
				f=1;
			}
			else if (mas[i][j] > num) {
				{
					posmax = pos;
					pos = (pos + posmin)/2;
				}
			}
			else if (mas[i][j] < num) {
				posmin = pos;
				pos = (pos + posmax)/2;
				}				
		}
	}
}
