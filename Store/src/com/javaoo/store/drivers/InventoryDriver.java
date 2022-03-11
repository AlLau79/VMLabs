package com.javaoo.store.drivers;

import com.javaoo.store.Book;
import com.javaoo.store.Item;

public class InventoryDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item[] myInv = new Item[50];
		myInv[0] = new Book("Godzilla on holiday", 24.95, 5, "Wesley","Ransom house", "FICTION");
		myInv[1] = new Book("Loch Ness", 49.95, 1, "Fred","Penquin Press", "FICTION");
		myInv[2] = new Book("MVS JCL", 89.95, 3, "Steve","Microsoft Press", "NON-FICTION");
		myInv[3] = new Book("Lingo in a nutshell", 19.95, 8, "Bill","O'Reilly", "NON-FICTION");
		myInv[4] = new Book("Grid Computing", 79.95, 2, "Bobby","Trouser Press", "NON-FICTION");

	}

}
