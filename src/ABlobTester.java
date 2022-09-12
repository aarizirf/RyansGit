import java.io.IOException;
import java.nio.file.Paths;
import java.io.*;
import java.util.*;
public class ABlobTester {
	public static void main(String[] args) throws Exception, IOException{
		Index i = new Index();
		i.init();
		File testFile = new File("objects/testerFile.txt");
		testFile.createNewFile();
		System.out.println(testFile.getName());
		i.add(testFile.getName());
		i.remove(testFile);
	}
}
