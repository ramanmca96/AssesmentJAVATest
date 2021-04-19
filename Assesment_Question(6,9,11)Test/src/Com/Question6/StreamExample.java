package Com.Question6;

import java.util.stream.IntStream;

public class StreamExample {
	public static void main(String[] args) {

			// Create an Array with Strings.
			String[] ProgramminLanguages = { "Java", "Selenium", "Python", "RUBY", "SQL" };

			//  length of an array.
			int length = ProgramminLanguages.length;

			
			IntStream.range(0, length)
					.forEach(index -> System.out.println("Value : " + (index + 1) + " is " + ProgramminLanguages[index]));
		}
	}

