import java.util.Scanner;

public class CheckSpecific {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
				System.out.print("Enter the number of items:");
				final int NUM_ITEMS=sc.nextInt();
				//to take user input of elements of array
				System.out.print("Enter the elements of array(seperated by space):");
				int [] arr=new int[NUM_ITEMS];
				for(int i=0;i<arr.length;i++)
					arr[i]=sc.nextInt();
				  //user input for specific value that is to be checked
			  System.out.print("Enter the value to be checked:");
		      int valueToCheck=sc.nextInt();
		      boolean status = false;
		      for(int i=0;i<arr.length;i++)
		      {
		    	  if(arr[i]==valueToCheck)
		    	  {
		    		  status=true;
		    		  break;
		    	  }
		      }
		      if(status==true)
		    	  System.out.printf("yes the value  the value you entered is present in array");
		      else
		    	  System.out.printf("No  the value the value you entered is not present in array"); 
			}


		

		      

		// TODO Auto-generated method stub

	}


