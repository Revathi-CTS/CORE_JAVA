import java.util.ArrayList;
public class ArrayListToArray {

	public static void main(String[] args) {
			    ArrayList<String> name= new ArrayList<>();
			    name.add("Revathi");
			    name.add("Virat");
			    name.add("Manoj");

			    // Creating a new array of String type
			    String [] arr = new String[name.size()];

			    // Converting ArrayList into the string array
			    name.toArray(arr);
			    System.out.print("Array: ");
			    for(int i=0;i<arr.length;i++) {
			      if(i==arr.length-1)
			      System.out.print(arr[i]);
			      else
				      System.out.print(arr[i]+",");
			    }

	}

}
