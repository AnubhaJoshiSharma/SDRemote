package javaProgPkg;

public class SuperKeywordChild extends SuperKeywordParent {
	public SuperKeywordChild() {
		super("Hello"); //Super keyword helps to initialize parent constructor with a value in case of inheritance
		System.out.println("This is child constructor");
	}
	public static void main(String[] args) {
		SuperKeywordChild skc = new SuperKeywordChild();
		skc.parentMethod();
	}

}
