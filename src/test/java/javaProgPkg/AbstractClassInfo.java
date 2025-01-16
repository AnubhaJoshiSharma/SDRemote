package javaProgPkg;

public abstract class AbstractClassInfo {
	int x,y;
	
	public void setUp() {
		x=20;
		y=20;
		System.out.println("From abstract class normal method" + (x*y));
	}
	public abstract void area();
}
