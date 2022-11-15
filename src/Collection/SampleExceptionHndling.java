package Collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SampleExceptionHndling {

	public static void main(String[] args) {
		readFile("c:\text1.txt");
		readFile("c:\text2.txt");
		readFile("c:\text3.txt");
		readFile("c:\text4.txt");
		
		try {
			readFile2("c:\test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void readFile(String path) {
		try {
			FileInputStream stream = new FileInputStream(new File(path));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found! " + path);
		}
	}
	
	public static void readFile2(String path) throws FileNotFoundException {
		FileInputStream stream = new FileInputStream(new File(path));
}
}