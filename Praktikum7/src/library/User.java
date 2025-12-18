package library;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	protected List<Media> borrowedMedia = new ArrayList<>(); // Sichtbarkeit hier Absicht zur Vereinfachung

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<Media> getBorrowedMedia() {
		return borrowedMedia;
	}
}
