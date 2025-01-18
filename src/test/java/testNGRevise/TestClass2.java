package testNGRevise;

import org.testng.annotations.Test;

public class TestClass2 {
  @Test(groups= {"gp1","gp2"})
  public void method1() {
	  System.out.println("This is test case 1 from class 2");
  }
  @Test(groups= {"gp1","gp2"})
  public void method2() {
	  System.out.println("This is test case 2 from class 2");
  }
  @Test(groups= {"gp3","gp4"})
  public void method3() {
	  System.out.println("This is test case 2 from class 2");
  }
}
