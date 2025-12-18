import java.util.ArrayList;
import java.util.Iterator;

public class Zahlenliste {
	public static void main(String[] args) {
		ArrayList<Integer> zahlenListe = new ArrayList<Integer>();

		zahlenListe.add(7);
		zahlenListe.add(21); // null
		zahlenListe.add(42);

		Iterator<Integer> it = zahlenListe.iterator();
		while (it.hasNext()) {
			Integer z = it.next();
			System.out.println(z);
		}
		
		// for (Integer i : zahlenListe)
		// zahlenListe.stream().forEach(x -> System.out.println(x));
	}
}
