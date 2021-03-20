//to sort the product names
import java.util.*;

public class NameSort {
	public static void main(String []args) {
		ArrayList<String> names= new ArrayList<String>();
		names.add("Apple");
		names.add("Eye");
		names.add("Dog");
		names.add("Bat");
		names.add("Cat");
		System.out.println("the names you have enterd : "+names);
		Collections.sort(names);
		System.out.println("the sorted names are : "+names);
		
	}
	

}
