package testNGRevise;

import org.testng.annotations.Test;

public class TestClass1 {
  @Test(groups= {"gp6"})
  public void method1() {
	  System.out.println("This is test case 1 from class 1");
  }
  @Test(groups= {"gp2"})
  public void method2() {
	  System.out.println("This is test case 2 from class 1");
  }
  @Test(groups= {"gp3"})
  public void method3() {
	  System.out.println("This is test case 2 from class 1");
  }
}
