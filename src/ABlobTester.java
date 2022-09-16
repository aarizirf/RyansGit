import java.io.IOException;
import java.util.ArrayList;
import java.io.*;

public class ABlobTester {
	public static void main(String[] args) throws Exception, IOException{
//		Index i = new Index();
//		i.init();
//		File testFile = new File("test.txt");
//		testFile.createNewFile();
//		ABlob.createBlob(testFile.getName());
//		System.out.println(testFile.getName());
//		i.add(testFile.getName());
////		i.remove(testFile);
		ArrayList<String> list = new ArrayList<>();
		list.add("blob : asdf");
		list.add("blob : asdf");
		list.add("blob : asdf");
		Tree t = new Tree(list);
	}
}
