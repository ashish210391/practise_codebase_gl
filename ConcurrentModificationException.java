package corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {

	private List<Integer> list;

	private void addToList() {
		list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	}

	private void removeFromList() {

		for (Integer i : list) {
			list.remove(1);
		}

	}

	private void removeFromListWithoutConModExe() {
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
	}

	public static void main(String[] args) {

		ConcurrentModificationException con = new ConcurrentModificationException();
		con.addToList();
		//con.removeFromList();
		con.removeFromListWithoutConModExe();
	}
}
