package com.arraylist.adam;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	 	Object[] items = new Object[10];
	 	int size = 0;
	 	
	@Override
	public boolean add(T item) {     
		if (size == items.length) {
		     newSize();
		}
		items[size++] = item;
		return true;
	}

	private void newSize() {
		int arraySize = items.length * 2;
		items = Arrays.copyOf(items, arraySize);
	}
	
	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	public T get(int index) throws IndexOutOfBoundsException {
		if (index <= size) {
			return (T) items[index];
		} else {
			throw new IndexOutOfBoundsException ("WARNING: OUT OF BOUNDS");
		}
	}	
}