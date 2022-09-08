import java.io.IOException;
import java.nio.file.Paths;
import java.io.*;
import java.util.*;
public class ABlobTester {
	public static void main(String[] args) throws Exception, IOException{
		Index.init();
		File testFile = new File("objects/tester.txt");
		testFile.createNewFile();
		System.out.println(testFile.getName());
		Index.add(testFile);
	}
}
