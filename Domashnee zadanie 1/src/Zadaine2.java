public class Zadaine2 {
	public static void main(String[] args) {

		int a, b, c;
		a = -2;
		b = 1;
		c = 2;
		if (b*b - (4*a*c) < 0)
			System.out.println("������ ���");
		else
		{
			if (b*b - (4*a*c) == 0)
				System.out.println("Rjhtym: " + (-b/(2*a)));
			else
			{
				System.out.println("������ 1: " + ((-b + Math.sqrt(b*b - (4*a*c)))/(2*a)));
				System.out.println("������ 2: " + ((-b - Math.sqrt(b*b - (4*a*c)))/(2*a)));
			}
		}
	}
}