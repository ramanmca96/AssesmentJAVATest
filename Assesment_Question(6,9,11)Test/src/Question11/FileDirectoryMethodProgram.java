package Question11;

import java.io.File;

public class FileDirectoryMethodProgram {

	public static void main(String[] args) {
		
		File file=new File("D:\\Desktop");
		boolean mkdirs = file.mkdirs();
		System.out.println("Created Directory " +mkdirs);
		
		boolean directory = file.isDirectory();
		System.out.println("is Directory Method:" +directory);
		
		File absoluteFile = file.getAbsoluteFile();
		System.out.println("Path of File :" +absoluteFile);
		
		boolean hidden = file.isHidden();
		System.out.println("is That File has hidden" +hidden);
		
		boolean file2 = file.isFile();
		System.out.println("is That File :" +file2);
	}
}
