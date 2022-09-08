import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Index {
	public static void init() throws IOException {
		File dir = new File("objects");
		dir.mkdirs();
		Path path = Paths.get("objects");
		File emptyFile = new File(path + "/index.txt");
		emptyFile.createNewFile();
	}
	public static void add(File file) throws IOException, Exception{
		ABlob.createBlob(file);
		
	}
}
//Questions for Theiss: creating directory in index