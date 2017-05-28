public class Zadanie6 {
	public static void main(String[] args) {
		int x;
		short xs;
		char xc = 0;
		String x16 = "";
		x = 152;
		if (x == 0)
			System.out.println(0);
		else
			while (x > 0)
			{
				xs = (short) (x % 16);
				if ((xs >= 10) && (xs <=15))
					switch (xs)
					{
					case 10:
						xs = 'A';
						break;
					case 11:
						xs = 'B';
						break;
					case 12:
						xs = 'C';
						break;
					case 13:
						xs = 'D';
						break;
					case 14:
						xs = 'E';
						break;
					case 15:
						xs = 'F';
						break;
					}			
				else
					xc = (char) (xs + '0');
				x16 = xc + x16;
				x = x / 16;
			}
		System.out.println(x16);
	}
}