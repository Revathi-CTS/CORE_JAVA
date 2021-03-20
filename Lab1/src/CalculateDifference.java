//calculating the difference 0f sum of squares and square of the sum of given range            
import java.util.Scanner;

public class CalculateDifference {
	public static void main(String args[])
	{
		System.out.println("Enter the range : ");
		try (Scanner sc = new Scanner(System.in)) {
			int n,sqsum=0,nsum=0;
			n=sc.nextInt();
			for(int i=0;i<=n;i++) {
				int nsq=i*i;
				sqsum+=nsq;
			}
			for(int j=0;j<=n;j++) {
				 nsum+=j;
				 }
		
		int nsumsq=nsum*nsum;
			 System.out.println(nsumsq-sqsum);
		}
			 
	}
		
	}

