package javaProgPkg;

public class ChainedConstructors {
	int x=10;
	int y;

	public ChainedConstructors(int x) {
		this();
		this.x=x;
		System.out.println(this.x);
	}
	public ChainedConstructors() {
		y = 20;
		System.out.println("y="+y);
	}
	public static void main(String[] args) {
		ChainedConstructors cc = new ChainedConstructors(30);
	}
}
