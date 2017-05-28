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
			 System.out.print("ƒо города " + name + " можно доехать на этом транспорте");
		 else
			 System.out.print("ƒо города " + name + " нельз€ доехать на этом транспорте"); 
	}
}
