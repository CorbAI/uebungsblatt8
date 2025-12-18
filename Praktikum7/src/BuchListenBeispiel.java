import java.util.ArrayList;
import java.util.Iterator;

public class BuchListenBeispiel {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();

		Book buch1 = new Book("Carlo Rovelli", "Seven brief lessons on physics", 2014);
		books.add(buch1);

		Book buch2 = new Book("Adam Rutherford", "The origin of life / The future of life", 2013);
		books.add(buch2);

		Book buch3 = new Book("Guy Deutscher", "The unfolding of languages", 2005);
		books.add(buch3);

		books.add(new Book("Morris Kline", "Mathematics - The loss of certainty", 1980));

		Iterator<Book> it = books.iterator();
		while (it.hasNext()) {
			Book b = it.next();
			System.out.println(b.getAuthor() + ": " + b.getTitle() + ", " + b.getReleaseYear());
		}

		// sortieren nach Erscheinungsjahr:
		/*System.out.println("---");
		Collections.sort(books, (b1, b2) -> b1.getReleaseYear()-b2.getReleaseYear());
		for (Book b : books) {
			System.out.println(b.getAuthor() + ": " + b.getTitle() + ", " + b.getReleaseYear());
		}*/

		// filtern nach Buecher aelter als 2010
		/*System.out.println("---");
		List filteredList = books.stream().filter(b -> b.getReleaseYear() < 2010).collect(Collectors.toList());
		for (Book b : filteredList) {
			System.out.println(b.getAuthor() + ": " + b.getTitle() + ", " + b.getReleaseYear());
		}*/
	}
}
