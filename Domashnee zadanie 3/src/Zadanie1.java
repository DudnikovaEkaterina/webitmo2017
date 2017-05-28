public class Zadanie1 {

	public static void main(String[] args) {
		String s=new String ("Жила-была коза с козлятами. Уходила коза в лес есть траву шелковую, пить воду студеную. Как только уйдет - козлятки запрут избушку и сами никуда не выходят. Воротится коза, постучится в дверь и запоет: - Козлятки, ребятушки! Отопритеся, отворитеся! Ваша мать пришла - молока принесла; Бежит молоко по вымечку, Из вымечку по копытеччку, Из копытеччку во сыру землю! Козлятки отопрут дверь и впустят мать. Она их покормит, напоит и опять уйдет в лес, козлятки запрутся крепко-накрепко. Волк подслушал, как поет коза. Вот раз коза ушла, волк побежал к избушке и закричал толстым голоском: - Вы, детушки! Вы козлятки! Отопритеся, Отворитеся! Ваша мать пришла, Молока принесла. Полны копытца водицы!");
		s=s.toLowerCase();
		String tmp=new String();
			tmp = s.replace(".", "");
			s = tmp;
			tmp = s.replace(",", "");
			s = tmp;
			tmp = s.replace(":", "");
			s = tmp;
			tmp = s.replace("-", " ");
			s = tmp;
			tmp = s.replace("!", "");
			s = tmp;
			tmp = s.replace(";", "");
			s = tmp;
			tmp = s.replace("  ", " "); 
			s = tmp;
			tmp = s.replace("  ", " "); 
			s = tmp;
			System.out.println(s);	
		String[] sParts;
		sParts = s.split(" ");
		for (int n=0; n<sParts.length;n++){
			sParts[n].trim();
		}
		
		for (int i=0; i<sParts.length;i++){
			int sum=0;
			if (sParts[i]!=" "){
				System.out.print(sParts[i]+":");
				int k=0;
				int[] number=new int[104]; 
				for(int j=0;j<sParts.length;j++){
					if (sParts[i].equals(sParts[j]))
					{ 
						sum=sum+1; 
						number[k]=j;
						k++;
					}
				}
				
				System.out.print(sum);
				System.out.println();
				for (k=0;k<104;k ++) 
				{
					sParts[number[k]]=" ";
				} 
			}
			
		}

		
		
	}


	}