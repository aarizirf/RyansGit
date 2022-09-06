import java.io.IOException;
import java.nio.file.Paths;
import java.io.*;
import java.util.*;
public class ABlobTester {
	public static void main(String[] args) throws Exception, IOException{
		File testFile = new File("TesterFile.txt");
		ABlob.createBlob(testFile);
	}
}
