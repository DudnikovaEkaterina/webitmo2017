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
			System.out.println(name + " не может поехать в город " + gorod.name + " потому что нет загранпаспорта");
		else if (tran.maxras < gorod.rasstoyanie)
			System.out.println(name + " не может поехать в город " + gorod.name + " на этом транспорте");
		else if (dengi < tran.stoimost)
			System.out.println(name + " не позволить себе этот транспорт");
		else System.out.println(name + " может поехать в город " + gorod.name);
	}
}
