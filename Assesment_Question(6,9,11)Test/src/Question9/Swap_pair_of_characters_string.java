package Question9;

public class Swap_pair_of_characters_string {

	public static void main(String args[]) {
		
		String Value="Java Spring Boot";
	  
			char[] charArray = Value.toCharArray();
	  
	        // Traverse the character array
	        for (int i = 0; i < charArray.length - 1; i += 2) {
	  
	            // Swapping the characters
	            char temp = charArray[i];
	            charArray[i] = charArray[i + 1];
	            charArray[i + 1] = temp;
	        }
	        
	        System.out.println(charArray);
	        
	    }
	  
	}

