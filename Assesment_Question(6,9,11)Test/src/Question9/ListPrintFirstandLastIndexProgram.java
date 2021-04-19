package Question9;

import java.util.ArrayList;

public class ListPrintFirstandLastIndexProgram {

	public static void main(String[] args) {

		// Create a Objects for ArrayList
		ArrayList<String> languages = new ArrayList<String>();

		// Using Add Method Add The Element
		languages.add("Java");
		languages.add("Selenium");
		languages.add("Python");
		languages.add("Ruby");
		languages.add("Java Spring Boot");
		languages.add("Java");
		languages.add("Machine Learning");
		languages.add("RDBMS");
		
		
		 String string = languages.get(0);
		System.out.println("FIRST INDEX VALUE IS:" +string);
		
		String lastIndex = languages.get(languages.size()-1);
		System.out.println("Last Index Of Given Collection :" +lastIndex);
	}
	
	
}
