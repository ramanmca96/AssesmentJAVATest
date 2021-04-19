package Question11;

import java.io.File;
import java.util.Scanner;

public class ExampleofFileCanReadMethod {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\ramv2c18461\\Desktop\\Java Programs\\java.txt");
		try {
			System.out.println(file.canRead());
			Scanner scan = new Scanner(file);

			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				System.out.println(line);
				System.out.println("File has been readed");
			}
		} catch (Exception e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
	}
}
