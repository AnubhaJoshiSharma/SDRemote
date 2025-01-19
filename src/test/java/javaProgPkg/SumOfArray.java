package javaProgPkg;

import java.util.Scanner;

public class SumOfArray {
	int []arr;
	
	public int[] createAnArray() {
		System.out.println("Please enter the size of array you want");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if(size<1) {
			System.out.println("You entered an invalid size for the array. Terminating Execution!");
			System.exit(0);
		}
		else {
			arr = new int[size];
			System.out.println("Please proceed to enter array elements of your choice");
			for(int i=0;i<arr.length;i++) {
				arr[i]= sc.nextInt();
			}
			System.out.println("Array created");
			sc.close();
		}
		return arr;
	}
	public void addAllELements(int [] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			}
		System.out.println("Sum of all elements is "+ sum);	
	}
	public static void main(String[] args) {
		SumOfArray soa = new SumOfArray();
		soa.addAllELements(soa.createAnArray());
	}
	
	
	
	
	
	
	
	
	
	
	
}
/*Scanner sc;
int [] arr;
	int size;
	public int [] setUpArray() {
	
		System.out.println("Enter the array size ");
		sc = new Scanner(System.in);
		size = sc.nextInt();
		if(size<1) {
			System.out.println("Invalid size of array entered");
			System.exit(0);
		}
		arr = new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array you created is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		return arr;
	}
	public void sum(int [] arr1) {
		int sum = 0;
		for(int i=0;i<arr1.length;i++) {
			sum+=arr1[i];
		}
		System.out.println("Sum of all array elements is "+ sum);
	}
	public static void main(String[] args) {
		SumOfArray soa = new SumOfArray();
		//soa.setUpArray();
		soa.sum(soa.setUpArray());
	}
}
*/