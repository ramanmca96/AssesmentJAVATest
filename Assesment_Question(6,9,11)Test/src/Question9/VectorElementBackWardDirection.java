package Question9;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorElementBackWardDirection {

	public static void main(String[] args) {

		// Create a Vector Collection
		Vector<String> Books = new Vector<>();
		Books.add("Java");
		Books.add("Selenium");
		Books.add("Python");
		Books.add("Ruby");
		Books.add("Java Spring Boot");
		Books.add("Java");
		Books.add("Machine Learning");
		Books.add("RDBMS");

		System.out.println("Before the reverse Value:");
		System.out.println(Books);

		System.out.println(" ");
		// Iterate The Collection value
		/*
		 * ListIterator<String> listIterator = Books.listIterator();
		 * while(listIterator.hasPrevious()) { String previous =
		 * listIterator.previous(); System.out.println("String " +previous); }
		 */
		// Iterate The Value Backforward
		System.out.print("After Reverse Backward The Value :");
		ListIterator<String> listIterator2 = Books.listIterator(8);
		while (listIterator2.hasPrevious()) {
			String string = (String) listIterator2.previous();

			System.out.println(string);
		}

	}
}
