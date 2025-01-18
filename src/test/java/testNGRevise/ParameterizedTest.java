package testNGRevise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

  @Test
  @Parameters({"i","j"})
  public void testMethod(String i,String j) {
	  System.out.println(i+j);
  }
}
