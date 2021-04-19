package Question9;

import java.util.ArrayList;
import java.util.List;

public class ListToStreamProgram {

	public static void main(String[] args) {
		// Create a Objects for ArrayList
		ArrayList<String> languages = new ArrayList<String>();

		ArrayList<String> copyNames = new ArrayList<String>();

		// Using Add Method Add The Element
		languages.add("Java");
		languages.add("Selenium");
		languages.add("Python");
		languages.add("Ruby");
		languages.add("Java Spring Boot");
		languages.add("Java");
		languages.add("Machine Learning");
		languages.add("RDBMS");

		languages.stream().filter(f -> f.length() > 5).forEach(n -> System.out.println(n));

	}
}
