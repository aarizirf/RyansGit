import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ABlob {
	//Takes in file name and returns string of file contents
	private static String getFileString(String fileName) throws IOException {
		//finds file path
		Path filePath = Path.of(fileName);
		//gets file content from file path
		return Files.readString(filePath);
	}

	private static String encryptThisString(String input) {
        try {
            // getInstance() method is called with algorithm SHA-1
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            // digest() method is called
            // to calculate message digest of the input string
            // returned as array of byte
            byte[] messageDigest = md.digest(input.getBytes());
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
            // Convert message digest into hex value
            String hashtext = no.toString(16);
 
            // Add preceding 0s to make it 32 bit
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            // return the HashText
            return hashtext;
        }
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
}
	private static void copyContent(File a, File b) throws Exception
	    {
	        FileInputStream in = new FileInputStream(a);
	        FileOutputStream out = new FileOutputStream(b);
	        try {
	            int n;
	            // read() function to read the
	            // byte of data
	            while ((n = in.read()) != -1) {
	                // write() function to write
	                // the byte of data
	                out.write(n);
	            }
	        }
	        finally {
	            if (in != null) {
	                // close() function to close the
	                // stream
	                in.close();
	            }
	            // close() function to close
	            // the stream
	            if (out != null) {
	                out.close();
	            }
	        }
	        System.out.println("File Copied");
	    }
	//TODO: 1) Make function to create the file into the objects folder in the Git directory function to write the file. 
	//TODO: 2) Make constructor that combines these methods and actually makes the Blob
	public static void main (String[] args) {
		System.out.println(encryptThisString("Hello World"));
	}
	
}
