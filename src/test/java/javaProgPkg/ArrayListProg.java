package javaProgPkg;
import java.util.ArrayList;
import java.util.List;

public class ArrayListProg {
	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<Integer>();
		System.out.println("size of list without me providing it "+ mylist.size());
		mylist.add(15);
		System.out.println("size of list now "+ mylist.size());
		System.out.println(mylist.get(0));
		mylist.add(1, 10);
		System.out.println("size of list now "+ mylist.size());
		System.out.println("Duplicates are allowed in a List");
		mylist.add(15);
		for(int i=0;i<mylist.size();i++) {
			System.out.println(mylist.get(i));
		}


	}

}
