/*
Course: Intro To Computer Science
Homework: 2
Task: 5
Name: Guy Itzhaki
E-mail: itzhaki1234@gmail.com
*/
// prints division of coins to quarters and cents
public class TestRandom
{
	// Returns true if the given year is a leap year, false otherwise.
	private static int random4 ()
 	{
		return (int)(Math.random()*4);
	}
	public static void main (String[] args)
	{
		int num=Integer.parseInt(args[0]);
		int num0=0;
		int num1=0;
		int num2=0;
		int num3=0;
		int rand=0;
		for (int i=1; i<=num; i++)
		{
			rand=random4();
			switch (rand)
			{
				case 0: num0++; break;
				case 1: num1++; break;
				case 2: num2++; break;
				case 3: num3++; break;
			}			
		}
		System.out.println("The number of times 0 was randomize is: "+num0);
		System.out.println("The number of times 1 was randomize is: "+num1);
		System.out.println("The number of times 2 was randomize is: "+num2);
		System.out.println("The number of times 3 was randomize is: "+num3);
	}
}	
