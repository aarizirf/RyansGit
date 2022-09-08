import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class Index {
private HashMap<String, String> list = new HashMap<String, String>();
	public void init() throws IOException {
		File dir = new File("objects");
		dir.mkdirs();
		Path path = Paths.get("objects");
		File emptyFile = new File(path + "/index.txt");
		emptyFile.createNewFile();
	}
	public void add(File file) throws IOException, Exception{
		ABlob.createBlob(file);
		String fileString = ABlob.getFileString(file);
		FileWriter myWriter = new FileWriter("objects/index.txt");
	      myWriter.write(file.getName() + " --> " + ABlob.encryptThisString(fileString));
	      myWriter.close();
	      list.put(file.getName(), ABlob.encryptThisString(fileString));
	      System.out.println("Successfully wrote to the file.");
	}
	public void remove(File file) throws IOException, Exception{
		System.out.println(list.get(file.getName()));
		String sha1FileName = "objects/" + list.get(file.getName())+ ".txt";
		File myObj = new File(sha1FileName); 
	    if (myObj.delete()) { 
	      System.out.println("Deleted the file: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	    file.delete();
		list.remove(file.getName());
		FileWriter myWriter = new FileWriter("objects/index.txt");
		for(Map.Entry<String, String> key : list.entrySet()) {
		      myWriter.write(key + " --> " + list.get(key));
		}
		myWriter.close();
		
	}
}
//Questions for Theiss: creating directory in index