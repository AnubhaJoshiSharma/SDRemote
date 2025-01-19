package testNGRevise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvided {
	@DataProvider(name="TestData") 
	public Object[][] provideData() {
		return new Object[][] {
			{2,10},
			{4,8},
			{3,7}
		};
	}
	@Test(dataProvider="TestData")
	public void addNumbers(int i,int j) {
		System.out.println(i+j);
	}

}
