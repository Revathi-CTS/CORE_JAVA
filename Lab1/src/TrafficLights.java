// Traffic Lights
import java.util.Scanner;

public class TrafficLights {
	public static void  main(String[]args) {
		System.out.println("please choose the following : \n1)Red\n2)Orange\n3)Green");
		try (Scanner sc = new Scanner(System.in)) {
			{
				int choice=sc.nextInt();
				if 	(choice==1) {
					System.out.println("STOP");
				}
				else if	(choice==2) {
					System.out.println("WAIT");
				}
else  if (choice==3) {
					System.out.println("GO");
				}
			}
		}
		
		
	}

}
