//checking the number is power of two or not 
import java.util.Scanner;

public class Power2 {
public static void main(String[]args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		if(checking(num)==true)
			System.out.println("The Number you have entered is power of 2 ");
		else 
			System.out.println("The Number you have entered is not power of 2 ");
	} 
	}

private static boolean checking(int num) {
	
	
	boolean status =false;
	while(num>0) {
		if(num%2==0) {
			num=num/10;
		}
		else {
			break;
		}
	}
	if(num==0)	{
		status=true;	
	}
	else {
		status=false;
	}
		
	return status;
}

}