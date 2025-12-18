package library;

public class Media {
	private String title;
	private int releaseYear;
	private User lendTo;

	public Media(String t, int ej) {
		title = t;
		releaseYear = ej;
	}

	public String getTitle() {
		return title;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public boolean isAvailable() {
		return lendTo == null;
	}

	public void lendTo(User user) {
		if (lendTo != null) { return; } // TODO: Fehlerbehandlung (Vorlesung 12)
		lendTo = user;
	}

	public void returnMedia() {
		lendTo = null;
	}
}
