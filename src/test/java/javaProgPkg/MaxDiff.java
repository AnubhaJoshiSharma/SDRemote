package javaProgPkg;

public class MaxDiff {
	public void maxDiff() {
		int [] a = {10,21,39,46,51};
		int diff=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[j]-a[i]>diff) {
							diff= a[j]-a[i];
							}
				}
		}
		System.out.println("Max diff is "+ diff);
	}
	public static void main(String[] args) {
		MaxDiff md = new MaxDiff();
		md.maxDiff();
	}

}
