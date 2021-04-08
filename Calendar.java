/*
Course: Intro To Computer Science
Homework: 2
Task: 4
Name: Guy Itzhaki
E-mail: itzhaki1234@gmail.com
*/
// Prints the number of days in the 12 months of a given year 
public class Calendar
{
	// Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year)
 	{
		boolean isLeap;
		isLeap = ((year % 4) == 0) && ((year % 100) != 0);
		isLeap = isLeap || ((year % 400) == 0);
		return isLeap;
	}
	// Returns the number of days in the given month, in that year.
	private static int nDaysInMonth(int month, int year) 
	{
		switch (month)
		{	
			case 1: return 31;
          	case 2: if (isLeapYear(year))
				return 29;
			else
				return 28;
           	case 3: return 31;
         	case 4: return 30;		
         	case 5: return 31;	
          	case 6: return 30;	
        	case 7: return 31;
         	case 8: return 31;		
       		case 9: return 30;
			case 10: return 31;
			case 11: return 30;
			case 12: return 31;	
			}	
			return 0;
		}
	public static void main (String[] args)
	{
		int years=Integer.parseInt(args[0]);
		if (isLeapYear(years))
			System.out.println("Year "+years+" is a leap year");
		else
			System.out.println("Year "+years+" is a common year");
		for (int i=1; i<=12; i++)
		{
			System.out.println("Month "+i+" has "+nDaysInMonth(i, years)+" days");	
		}
	}
}

