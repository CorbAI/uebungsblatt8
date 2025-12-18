public class Book {
	private String author;
	private String title;
	private int releaseYear;

	public Book(String a, String t, int ej) {
		author = a;
		title = t;
		releaseYear = ej;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public int getReleaseYear() {
		return releaseYear;
	}
}
