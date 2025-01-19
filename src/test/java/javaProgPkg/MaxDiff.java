package javaProgPkg;

public class MaxDiff {
	public void maxDiff() {
		int [] a = {10,21,39,46,51};
		int maxdiff = 0,tmp;
		for(int i=0;i<a.length-1;i++) {
			tmp = a[i+1]-a[i];
			if(tmp>maxdiff) {
				maxdiff = tmp;
			}
		}
		System.out.println(maxdiff);
	}
	public static void main(String[] args) {
		MaxDiff md = new MaxDiff();
		md.maxDiff();
	}

}
