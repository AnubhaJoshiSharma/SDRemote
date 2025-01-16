package javaProgPkg;

public class AbstractMainClass extends AbstractClassInfo {
	public static void main(String[] args) {
	//	AbstractClassInfo ab = new AbstractClassInfo(); --->CANNOT Instantiate Abstract class
		AbstractMainClass abm = new AbstractMainClass();
		abm.setUp();
		abm.area();
	}

	@Override
	public void area() {
		System.out.println("No Implementation done");
		
	}

}
