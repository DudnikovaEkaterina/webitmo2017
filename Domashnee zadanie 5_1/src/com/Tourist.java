package com;

public class Tourist {
	public String name;
	public int age;
	public boolean Zagran;
	public int dengi;
	
	public void init(String name, int age, boolean Zagran, int dengi) {
		this.name = name;
		this.age = age;
		this.Zagran = Zagran;
		this.dengi = dengi;
	}
	
	public void poedet(Goroda gorod, Transport tran) {
		if ((gorod.strana != "Russia") && (Zagran == false))
			System.out.println(name + " �� ����� ������� � ����� " + gorod.name + " ������ ��� ��� ��������������");
		else if (tran.maxras < gorod.rasstoyanie)
			System.out.println(name + " �� ����� ������� � ����� " + gorod.name + " �� ���� ����������");
		else if (dengi < tran.stoimost)
			System.out.println(name + " �� ��������� ���� ���� ���������");
		else System.out.println(name + " ����� ������� � ����� " + gorod.name);
	}
}
