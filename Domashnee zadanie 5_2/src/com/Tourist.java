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
		if ((gorod.strana != "–осси€") && (Zagran == "Ќет"))
			res = (name + " не может поехать в город " + gorod.name + " потому что нет загранпаспорта");
		else if (tran.maxras < gorod.rasstoyanie)
			res = (name + " не может поехать в город " + gorod.name + " на этом транспорте");
		else if (dengi < tran.stoimost)
			res = (name + " не позволить себе этот транспорт");
		else res = (name + " может поехать в город " + gorod.name);
		return res;
	}
}
