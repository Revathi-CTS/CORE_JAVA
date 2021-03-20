// printing all the prime numbers upto the number
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("enter the number ");
		
		try (Scanner sc = new Scanner(System.in)) {
			int num=sc.nextInt();
			int c=0;
			System.out.println("the primenumbers are");
			for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0)	
					c++;	
						}
			if(c==2) 
				System.out.println(i);
				c=0;
				 }
			
		}

}
}