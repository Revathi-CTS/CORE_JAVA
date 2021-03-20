
//Fibonacci sequence upto nth value

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[]args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the value : ");
			int num=sc.nextInt();
			int n1=0,n2=1,n3=0;
			if (num==0) {
				System.out.println(num);
			}
			else if (num==1) {
				System.out.println("Your Fibonacci Sequence is : 0  1");
				
			}
for(int i=1;i<=num;i++) {
n3=n1+n2;
System.out.print(n1+" ");
n1=n2;
n2=n3;


}
		}
			
		}
			
	
	}
	
	


