package com;

public class Goroda {
	String name;
	String strana;
	int rasstoyanie;
	
	public void init(String name, String strana, int rasstoyanie) {
		this.name = name;
		this.strana = strana;
		this.rasstoyanie = rasstoyanie;
	}
	public void doedem(Transport tran){
		 if (tran.maxras > rasstoyanie)
			 System.out.print("�� ������ " + name + " ����� ������� �� ���� ����������");
		 else
			 System.out.print("�� ������ " + name + " ������ ������� �� ���� ����������"); 
	}
}
