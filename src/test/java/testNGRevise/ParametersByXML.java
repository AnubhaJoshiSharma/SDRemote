package testNGRevise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersByXML {
	@Parameters({"fname","lname"})
	@Test
  public void passingParams(String fname, String lname) {
	  System.out.println(fname+" " +lname);
  }
}
