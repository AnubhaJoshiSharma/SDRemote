package javaProgPkg;

public class StringImpMeths {
	String str;
	char [] str1;
	public static void main(String[] args) {
		StringImpMeths sim = new StringImpMeths();
		String x = "Abhisheik";
		String y = "Sharma";
		sim.str = x.concat(y);
		System.out.println("Concatinated String is "+ sim.str);
		System.out.println("Length of concatenated String is "+ sim.str.length());
		System.out.println("Character at position 4 is "+ sim.str.charAt(3));
		sim.str1 = sim.str.toCharArray();
		System.out.println("Length of character array str1 is "+ sim.str.length());
		System.out.println("Charater at position 3 of the array is "+sim.str1[2]);
		System.out.println("Does str contain an eik? "+ sim.str.contains("eik"));
		System.out.println("Lets cut the string into two parts now");
		sim.str = sim.str.substring(6);
		System.out.println(sim.str);
				
		
	}

}
