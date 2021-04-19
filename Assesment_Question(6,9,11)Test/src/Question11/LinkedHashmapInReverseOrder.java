package Question11;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashmapInReverseOrder {

	public static void main(String[] args) {

		// Create Linked Hashmap
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "Java");
		map.put(2, "Selenium");
		map.put(3, "SQL");
		map.put(4, "Python");
		map.put(5, "Ruby");
		map.put(6, "HTML");
		map.put(7, "PHP");

		// iterate the value Using EntrySet Method
		Set<Entry<Integer, String>> entrySet = map.entrySet();

		for (Entry<Integer, String> entry : entrySet) {

			Integer key = entry.getKey();
			System.out.println("Key  Alone:  " + key + "  " + "Values Alone : " + entry.getValue());
		}

		// to Reverse LinkedHashmap

		ListIterator<Map.Entry<Integer, String>> iterator = new ArrayList<Map.Entry<Integer, String>>(map.entrySet())
				.listIterator(map.size());
		while (iterator.hasPrevious()) {
			Map.Entry<Integer, String> entry = iterator.previous();
			System.out.println(entry);
		}

	}
}
