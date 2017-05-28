import com.*;
public class Puteshestvia {
	public static void main(String[] args) {
		Tourist Vasya = new Tourist();
		Vasya.init("Вася", 19, false, 10000);
		Goroda Tula = new Goroda();
		Tula.init("Тула", "Russia", 1000);
		Transport poezd = new Transport();
		poezd.init("Поезд", 5000, 10000);
		Vasya.poedet(Tula, poezd);
	}
}
