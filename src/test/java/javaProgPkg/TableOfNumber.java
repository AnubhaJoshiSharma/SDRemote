package javaProgPkg;

import java.util.Scanner;

public class TableOfNumber {
	
	public int getNumberFromUser() {
		System.out.println("Eneter number to get its table ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	public void printTable(int num) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=num;
			System.out.println(num+"*"+i+"="+sum);
		}
	}
	public static void main(String[] args) {
		TableOfNumber ton = new TableOfNumber();
		ton.printTable(ton.getNumberFromUser());
	}

}
