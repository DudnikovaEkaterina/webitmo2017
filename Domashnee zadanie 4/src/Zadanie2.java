public class Zadanie2 {

	public static void main(String[] args) {
		String text = "Мой дядя самых честных правил,\nКогда не в шутку занемог,\nОн уважать себя заставил\nИ лучше выдумать не мог.\nЕго пример другим наука;\nНо, боже мой, какая скука\nС больным сидеть и день и ночь,\nНе отходя ни шагу прочь!\nКакое низкое коварство\nПолуживого забавлять,\nЕму подушки поправлять,\nПечально подносить лекарство,\nВздыхать и думать про себя:\nКогда же черт возьмет тебя!";
		int n=0,prob=0,maxprob=0;
		for (int i = 0;i<text.length();i++)
		{
			if (text.charAt(i)==' ')
					prob++;
			if (text.charAt(i)=='\n')
				{
					n++;
					if (prob>maxprob)
						maxprob = prob;
					prob = 0;
				}

		}
		String[][] words = new String[n+1][maxprob];
		String[] stroki = text.split("\n");
		for (int i=0; i<stroki.length;i++)
				words[i] = stroki[i].split(" ");
		for (int i=0; i<stroki.length; i++)
			{
			for (int j=0; j<words[i].length; j++)
				System.out.print(words[i][j]+" ");
			System.out.println();
			}
		System.out.println();
		for (int i=0; i<stroki.length; i++)
		{
		for (int j=0; j<words[i].length; j++)
			if (words[i][j].indexOf("а") != -1)
				System.out.print(words[i][j]+" ");
		}
	}

}
