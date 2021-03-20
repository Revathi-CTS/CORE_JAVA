//to find the difference between dates
import java.time.LocalDate;
import java.time.Period;

public class Duration {

	 static void durationDifference(LocalDate start_date,LocalDate end_date) 
	    { 
		 //calculating the duration difference in number of years,months,days using period 

	        Period difference = Period .between(start_date, end_date); 

	        System.out.print( "Difference "+ "between two dates is: "); 


	        System.out.printf( "%d years, %d months,  and %d days ", difference.getYears(), difference.getMonths(), difference.getDays()); 
	    } 


	    public static void main(String[] args) 
	    { 
	        //setting the date upto from which duration should be calculated in start date
	        LocalDate start_date = LocalDate.of(2018, 01, 10); 

	        //setting the current date in end date
	        LocalDate end_date  = java.time.LocalDate.now();

	        durationDifference(start_date, end_date); 
	    } 
}