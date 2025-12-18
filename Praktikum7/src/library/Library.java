package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
	private List<Media> allMedia = new ArrayList<>();
	private List<User> allUsers = new ArrayList<>();

	public void insertData() {
		allMedia.add(new Book("Carlo Rovelli", "Seven brief lessons on physics", 2014));
		allMedia.add(new Book("Adam Rutherford", "The origin of life / The future of life", 2013));
		allMedia.add(new Book("Guy Deutscher", "The unfolding of languages", 2005));
		allMedia.add(new Book("Morris Kline", "Mathematics - The loss of certainty", 1980));
		allUsers.add(new User("User A"));
		allUsers.add(new User("User B"));
	}

	public User getUser(int id) {
		return allUsers.get(id);
	}

	public Media getMedia(String title) {
		for (Media item : allMedia) {
			if (item.getTitle().equals(title)) {
				return item;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Library lib = new Library();
		lib.insertData();

		for (Media m : lib.getAllMedia()) {
			System.out.println(m.getTitle());
		}
		System.out.println("-----");
		System.out.println(lib.getMedia("Seven brief lessons on physics").isAvailable());
		lib.lendMediaTo(lib.getMedia("Seven brief lessons on physics"), lib.getUser(1));
		System.out.println(lib.getMedia("Seven brief lessons on physics").isAvailable());
		lib.returnMediaFrom(lib.getMedia("Seven brief lessons on physics"), lib.getUser(1));
	}

	public List<Media> getAllMedia() {
		return Collections.unmodifiableList(allMedia);
	}

	public boolean lendMediaTo(Media media, User user) {
		if (!media.isAvailable()) {
			return false; // TODO: Fehlerbehandlung, vgl. Vorlesung 12
		}
		media.lendTo(user);
		user.borrowedMedia.add(media);
		return true;
	}

	public boolean returnMediaFrom(Media media, User user) {
		if (media.isAvailable() || !user.getBorrowedMedia().contains(media)) {
			return false; // TODO: Fehlerbehandlung, vgl. Vorlesung 12
		}
		media.returnMedia();
		user.borrowedMedia.remove(media);
		return true;
	}

	public List<Media> getAvailableMedia() {
		// implement this!
		return null;
	}
}
