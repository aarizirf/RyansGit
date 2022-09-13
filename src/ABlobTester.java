import java.io.IOException;
import java.io.*;

public class ABlobTester {
	public static void main(String[] args) throws Exception, IOException{
		Index i = new Index();
		i.init();
		File testFile = new File("objects/index.txt");
//		testFile.createNewFile();
		System.out.println(testFile.getName());
		i.add(testFile);
//		i.remove(testFile);
	}
}
