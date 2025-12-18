package mylist;

/** Interface für eine List mit fester Ornung
 * @author Strickroth
 * @version 1.0
 * */
public interface MyList extends Iterable<Integer> {
	/**
	 * Fügt den Wert value an das Ende der Liste an
	 * @param value der anzufügende Wert, darf nicht -1 sein
	 */
	void add(int value);
	
	/**
	 * Gibt den Wert in der List an Position inde zurück
	 * @param index der Index der Liste, angefangen bei 0
	 * @return Wert an der Position index, oder -1 fall nicht vorhanden
	 */
	int get(int index);
	void clear();
	int size();
}
