//checkin number is increasing or not
import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
		 
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the number : ");
				int num=sc.nextInt();
				if( checkNumber(num)==true)
					System.out.println("the number you have enterd is an inceasing number");
				else 
					System.out.println("the number you have enterd is not an inceasing number");
			}
			
		// TODO Auto-generated method stub

	}

	private static boolean checkNumber(int num) {
		String str=Integer.toString(num);
		int c=0;
		boolean status=false;
		for (int i=str.length()-1;i>0;i--) {
			if(str.charAt(i)>=str.charAt(i-1)){
				c+=1;}
		}
		if(c==str.length()-1) {
			status=true;
		}
		else {
			status=false;
		}
		// TODO Auto-generated method stub
		return status;
	}

}
