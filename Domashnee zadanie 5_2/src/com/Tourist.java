package com;

public class Tourist {
	public String name;
	public int age;
	public String Zagran;
	public int dengi;
	
	public void init(String name, int age, String Zagran, int dengi) {
		this.name = name;
		this.age = age;
		this.Zagran = Zagran;
		this.dengi = dengi;
	}
	
	public String poedet(Goroda gorod, Transport tran) {
		String res;
		if ((gorod.strana != "������") && (Zagran == "���"))
			res = (name + " �� ����� ������� � ����� " + gorod.name + " ������ ��� ��� ��������������");
		else if (tran.maxras < gorod.rasstoyanie)
			res = (name + " �� ����� ������� � ����� " + gorod.name + " �� ���� ����������");
		else if (dengi < tran.stoimost)
			res = (name + " �� ��������� ���� ���� ���������");
		else res = (name + " ����� ������� � ����� " + gorod.name);
		return res;
	}
}
