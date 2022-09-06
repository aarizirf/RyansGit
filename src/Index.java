import java.io.*;
public class Index {
	public static void init() throws IOException {
		File emptyFile = new File("index.txt");
		emptyFile.createNewFile();
		File dir = new File("objects").mkdirs();
	}
}
//Questions for Theiss: creating directory in index