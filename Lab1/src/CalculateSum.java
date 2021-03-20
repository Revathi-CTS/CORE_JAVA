
////calculate sum of  n natural numbers divided by 3 and 5
	import java.util.Scanner;

	public class CalculateSum {
		public static void main(String args[]) {
			System.out.println("Enter the range : ");
			try (Scanner sc = new Scanner(System.in)) {
				int n;
				int add=0;
				n=sc.nextInt();
				for(int i=0;i<=n;i++) {
					if(i%3==0||i%5==0) 
						add+=i;
						}
				System.out.println("sum of the first n natural numbers which are divisible by 3 and 5 :" +add);
		}

	}
	}

