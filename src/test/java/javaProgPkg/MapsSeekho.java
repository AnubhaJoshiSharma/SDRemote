package javaProgPkg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapsSeekho {
public static void main(String[] args) {
	Map<Integer,String>mymap = new HashMap<Integer,String>();
	mymap.put(1, "Abhisheik");
	mymap.put(2, "Sharma");
	mymap.put(3, "Great");
	for(Entry<Integer,String> val:mymap.entrySet()) {
		System.out.println(val.getValue()+""+val.getKey());
	}
	for(int i=1;i<=mymap.size();i++)
	System.out.println(mymap.get(i));
	
}
}
