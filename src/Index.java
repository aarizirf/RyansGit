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
		String fileString = ABlob.getFileString(file);
		FileWriter myWriter = new FileWriter("objects/index.txt");
	      myWriter.write(file.getName() + " --> " + ABlob.encryptThisString(fileString));
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	}
}
//Questions for Theiss: creating directory in index