package library;
public class Book extends Media {
	private String author;

	public Book(String author, String title, int releaseYear) {
		super(title, releaseYear);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}
}
