public class Zadanie5 {
	public static void main(String[] args) {
		short a = 40, b = 60;
		char sym;
		if (b > a)
			for (int i = a; i < b; i++)
			{
				sym = (char) i;
				System.out.println(sym);
			}
		else
			for (int i = b; i < a; i++)
			{
				sym = (char) i;
				System.out.println(sym);
			}
	}
}