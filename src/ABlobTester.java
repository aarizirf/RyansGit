package testers;
import java.io.IOException;
import git.Blob;
public class ABlobTester {
	public static void main(String[] args) throws IOException{
		Blob blob = new Blob(".\\test\\.txt");
		System.out.println(encryptThisString(blob));
	}
}
