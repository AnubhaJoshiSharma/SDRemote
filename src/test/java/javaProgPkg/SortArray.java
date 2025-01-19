package javaProgPkg;

import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		int []arr = {2,4,6,1,7};
		
		for (int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println("Comparing "+arr[i]+ " with "+arr[j]);
				int tmp=0;
				if(arr[i]>arr[j]) {
					tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		for(Integer ele:arr) {
			System.out.println(ele);
		}
	}
}