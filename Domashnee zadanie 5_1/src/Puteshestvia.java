import com.*;
public class Puteshestvia {
	public static void main(String[] args) {
		Tourist Vasya = new Tourist();
		Vasya.init("����", 19, false, 10000);
		Goroda Tula = new Goroda();
		Tula.init("����", "Russia", 1000);
		Transport poezd = new Transport();
		poezd.init("�����", 5000, 10000);
		Vasya.poedet(Tula, poezd);
	}
}
