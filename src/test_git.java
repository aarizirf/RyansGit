import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test_git {
	
	final String TEST_SHA = "c22b5f9178342609428d6f51b2c5af4c0bde6a42";
	final String TEST_PATH = "test.txt";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
//		Creating test.txt MANUALLY right now with contents "hi"
//		"hi" sha1 = "c22b5f9178342609428d6f51b2c5af4c0bde6a42"
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
/*
 * What to test:
 * - Blob()
 * - Index.init()
 * - Index.add() 
 * - Index.remove()
 */
	@Test
	void blobInit() {
		ABlob b = new ABlob("test.txt");
		
//		look for file in objects directory
		File f = new File("objects/" + TEST_SHA);
		assertTrue(f.exists(), "File does not exist");
		
//		check contents
		Path p1 = Path.of("objects/" + TEST_SHA);
		Path p2 = Path.of(TEST_SHA);
		
		assertEquals(-1, filesCompareByLine(p1, p2), "Files are not equal");
	}
	
	@Test
	void indexInit() {
		ABlob b = new ABlob();
		
		
	}
	
	@Test
	void indexAdd() {
		ABlob b = new ABlob();
		
		
	}
	
	@Test
	void indexRemove() {
		ABlob b = new ABlob();
		
		
	}
	
	public static long filesCompareByLine(Path path1, Path path2) throws IOException {
	    try (BufferedReader bf1 = Files.newBufferedReader(path1);
	         BufferedReader bf2 = Files.newBufferedReader(path2)) {
	        
	        long lineNumber = 1;
	        String line1 = "", line2 = "";
	        while ((line1 = bf1.readLine()) != null) {
	            line2 = bf2.readLine();
	            if (line2 == null || !line1.equals(line2)) {
	                return lineNumber;
	            }
	            lineNumber++;
	        }
	        if (bf2.readLine() == null) {
	            return -1;
	        }
	        else {
	            return lineNumber;
	        }
	    }
	}

}
