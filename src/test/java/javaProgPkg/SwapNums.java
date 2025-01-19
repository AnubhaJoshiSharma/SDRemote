package javaProgPkg;

public class SwapNums {
	private int n1=10;
	private int n2=20;
	
	public void swapping() {
		int tmp=0;
		tmp=n1;
		n1=n2;
		n2=tmp;
		System.out.println("n1 is "+n1);
		System.out.println("n2 is "+n2);
	}
	public static void main(String[] args) {
		SwapNums sn = new SwapNums();
		sn.swapping();
	}

}
