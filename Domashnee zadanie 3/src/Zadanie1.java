public class Zadanie1 {

	public static void main(String[] args) {
		String s=new String ("����-���� ���� � ���������. ������� ���� � ��� ���� ����� ��������, ���� ���� ��������. ��� ������ ����� - �������� ������ ������� � ���� ������ �� �������. ��������� ����, ���������� � ����� � ������: - ��������, ���������! ����������, ����������! ���� ���� ������ - ������ ��������; ����� ������ �� �������, �� ������� �� ����������, �� ���������� �� ���� �����! �������� ������� ����� � ������� ����. ��� �� ��������, ������ � ����� ����� � ���, �������� �������� ������-��������. ���� ���������, ��� ���� ����. ��� ��� ���� ����, ���� ������� � ������� � �������� ������� ��������: - ��, �������! �� ��������! ����������, ����������! ���� ���� ������, ������ ��������. ����� ������� ������!");
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