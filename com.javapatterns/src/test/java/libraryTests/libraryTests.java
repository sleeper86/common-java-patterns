package libraryTests;

import org.junit.Test;

public class libraryTests {
	@Test
	public void testLibrary() throws Exception {
		String networkAddress = "http://www.google.com:8080";
		System.out.println(networkAddress.split("//")[0] + "//");
	}
}
