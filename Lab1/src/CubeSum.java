/*
*Name:Revathi
*description:to fnd sum of cubes of dogits of given number
*date:03/13/2021
*/
import java.util.Scanner;
class CubeSum{
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("please enter a value : ");
			int num=sc.nextInt();
			int sum=0;
			System.out.println("the number you have enterd is : "+num);
			while (num>0)
			{
				sum=sum+((num%10)*(num%10)*(num%10));
				num/=10;
			}
			System.out.println("CubeSum of your number is :"+sum);
		}
	}
}