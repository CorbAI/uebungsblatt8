package mylist.impl;

import java.util.Iterator;

import mylist.MyList;

public class MyArrayList implements MyList {
	int[] list = new int[0];

	@Override
	public void add(int value) {
		int[] newList = new int[list.length + 1];
		for (int i = 0; i < list.length; ++i) {
			newList[i] = list[i];
		}
		newList[list.length] = value;
		list = newList;
	}

	@Override
	public int get(int index) {
		if (index < 0 || index >= list.length) {
			return -1; // TODO improve error remporting
		}
		return list[index];
	}

	@Override
	public void clear() {
		list = new int[0];
	}

	@Override
	public int size() {
		return list.length;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new MyIterator(list);
	}

	static private class MyIterator implements Iterator<Integer> {

		private int position = 0;
		private int[] liste;

		public MyIterator(int[]liste) {
			this.liste=liste;
		}
		
		@Override
		public boolean hasNext() {
			return position < liste.length;
		}

		@Override
		public Integer next() {
			return liste[position++];
		}
		
	}
}
