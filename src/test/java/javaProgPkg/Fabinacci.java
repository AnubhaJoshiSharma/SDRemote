package javaProgPkg;

public class Fabinacci {
	private int i=0,j=1;
	private int tmp;
	public void printSeries() {
		System.out.print(i+" ");
		System.out.print(j+" ");
		for(int x = 0;x<8 
				;x++) {
		tmp = i+j;
		System.out.print(tmp+" ");
		i=j;
		j=tmp;
		}	
	}
public static void main(String[] args) {
	Fabinacci fb = new Fabinacci();
	fb.printSeries();
}
}
