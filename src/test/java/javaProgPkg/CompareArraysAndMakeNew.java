package javaProgPkg;

import java.util.ArrayList;
import java.util.List;

public class CompareArraysAndMakeNew {
	private int [] arr1 = {3,5,6,8};
	private int [] arr2 = {3,4,6,9};
	private List<Integer> mylist;
	
	
	public Object [] compareTwo() {
		mylist = new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==arr2[i]) {
				mylist.add(arr1[i]);
			}
		}
		Object[] ob = mylist.toArray();
		return ob;	
	}
	public void printNew(Object [] ob) {
		for(Object o:ob) {
			System.out.println(o);
		}
	}
public static void main(String[] args) {
	CompareArraysAndMakeNew camn = new CompareArraysAndMakeNew();
//	camn.compareTwo();
	camn.printNew(camn.compareTwo());
}
}
