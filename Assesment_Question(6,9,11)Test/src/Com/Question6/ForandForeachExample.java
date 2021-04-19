package Com.Question6;

import java.util.ArrayList;
import java.util.List;

public class ForandForeachExample {

	public static void main(String[] args) {

		// Create List
		List<String> Books = new ArrayList<String>();
		Books.add("Life is What You Make It");
		Books.add("Edward De Bono");
		Books.add("Power Of Subconcise Mind");
		Books.add("Wings Of Fire");
		Books.add("Life Has To be Move On");
		Books.add("Vanavaasam");

		// For Method Using Index
		for (int i = 0; i < Books.size(); i++) {
			System.out.println(Books.get(i));
		}
		System.out.println(" ");
		// ForEach Method
		for (String string : Books) {
			System.out.println("Foreach Method :" + string);
		}
	}
}
