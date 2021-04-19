package Com.Question6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterClassExample {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\ramv2c18461\\Desktop\\Java Programs\\Veetech.txt");

		boolean createNewFile;
		try {
			createNewFile = file.createNewFile();
			System.out.println("File Has Been Created");
		} catch (IOException e) {
			System.out.println("File Is Already Created");
			e.printStackTrace();
		}

		boolean canWrite = file.canWrite();
		System.out.println("File Can Be Write" + canWrite);

		FileWriter write = new FileWriter(file);
		write.write("Vee Technologies is a premier professional services and consulting company, "
				+ "offering cutting-edge solutions to organizations around the world. With a powerful blend of people,"
				+ " processes and groundbreaking technology-enabled solutions, we streamline operations, increase cash flow,"
				+ " reduce costs and maximize compliance while providing an edge over the competition. ");
		write.close();
	}
}
