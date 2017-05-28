
public class Zadanie2 {

	public static void main(String[] args) {
		String str=new String("1. <HTML> <HEAD> 2. <TITLE>Управление разрывом строк </Title> 3. </HEAD>	4. <BODY> 5. <marquee>Это моя учебная  страница.</marquee> 6. <H2>Меня зовут <kbd>Ольга. </kbd></H2> 7. <H3 align=center>Я живу во <em>Владивостоке</em>. </H3> 8.  <H4 align=right> Моя маленькая родина -  <font face=Academy color=Red>Сахалин</font>. </H4> 9. <H5 align=left>ДВГУ - ВУЗ в котором я работаю.</H5> 10. <B>Здесь</B> 11. <I>продемонстрированы</I> 12. <Blink>различные</Blink> 13. <U> способы </U> 14. <KBD>управления </KBD> 15. <FONT SIZE=5 COLOR=FF80C0>шрифтом:</FONT>  его  16. <FONT SIZE=5 COLOR=FF00FF>цветом</FONT> и 17. <FONT SIZE=+3 COLOR=FF00FF> размером. </FONT> 18. </BODY> </HTML>");
		System.out.println(str);
		
		String[] strParts;
		strParts = str.split(">");
		int num=strParts.length;
		System.out.println("Всего тэгов:"+num);
		System.out.println();
		
		

		int start=str.indexOf("<marquee>");
		int end=str.indexOf("</marquee>");
		System.out.println("Текст бегущей строки:");
		System.out.println(str.substring(start+9,end));
		System.out.println();
		
		

		String str1=new String();
		str1=str.toLowerCase();
		System.out.println("Использования тэга <kbd>:");
		start=str1.indexOf("<kbd>");
		end=str1.indexOf("</kbd>"); 
		System.out.println(str1.substring(start+5,end));
		int start1=str1.lastIndexOf("<kbd>");
		int end1=str1.lastIndexOf("</kbd>"); 
		System.out.println(str1.substring(start1+5,end1));
		System.out.println();

		

		int n1=str.indexOf("16");
		int n2=str.indexOf("17");
		String str2=new String(); 
		str2=str.substring(n1+3, n2); 
		int  n3=str2.indexOf("COLOR=");
		System.out.println("Значение цвета в 16 строке:");
		System.out.println(str2.substring(n3+6,n3+12));
		System.out.println();
		
	
	
		
		String str5=new String();
		str5=str;
		str5=str5.replace("=", "=\"");
		String str8=new String();
			String[] strParts1;
			strParts1 = str.split("="); 
			int m=strParts1.length; 
		int j=0;
		while ( j<m){
			int r=str5.indexOf("=\""); 
			str8=str8+str5.substring(0,r+2);
			String str6=new String();
			str6=str5.substring(r+2,str5.length()); 
			int p=str6.indexOf(" "); 
			int k=str6.indexOf(">"); 
			String str7=new String();		
			if (p<k){
				str6=str6.replaceFirst(" ","\" "); 
				int last=str6.indexOf("\""); 
				str7=str6.substring(0, last+2); 
				str6=str6.substring(last+2,str6.length());
				str8=str8+str7; 
				str5=str5.substring(r+str7.length());
			}
			else{
				str6=str6.replaceFirst(">","\">");
				int last=str6.indexOf("\"");
				str7=str6.substring(0, last+2);
				str6=str6.substring(last+2,str6.length());
				str8=str8+str7;
				str5=str5.substring(r+str7.length()+1);
			}
			j++;
			}
		str8=str8+str5;
		System.out.println(str8);
	
	}

}
