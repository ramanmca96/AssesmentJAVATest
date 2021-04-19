package Com.Question6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class BufferWriterExample {

	public static void main(String[] args)  {
		
		FileWriter file = null;
		try {
			file = new FileWriter("C:\\Users\\ramv2c18461\\Desktop\\Java Programs\\It_intern.txt");
			System.out.println("File Is Ready TO Write");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Write a Paragraph Using Write Method");
		BufferedWriter write=new BufferedWriter(file);
		try {
			write.write("At Vee Technologies, we are proud that the majority of our employees have been with "
					+ "us for more than a decade. This tells us how successful we have been in providing "
					+ "an environment where everyone can excel and creating an atmosphere"
					+ " where everyone feels at home.");
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
