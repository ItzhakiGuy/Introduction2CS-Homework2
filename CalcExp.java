/*
Course: Intro To Computer Science
Homework: 2
Task: 1
Name: Guy Itzhaki
E-mail: itzhaki1234@gmail.com
*/
// Prints the numbers which are done by the math problem by it's sort
public class CalcExp
{
	public static void main (String[] args)
	{
		double raise=Double.parseDouble(args[0]);
		int numex=Integer.parseInt(args[1]); //Variable of N
		double counter=1.0; //Counts the lower part (count times from 1 to N)
		double total=1.0; //Sums the E power x
		double upper=1.0;
		for (int i=1; i<=numex; i++)
		{
			counter=counter*i;
			upper=upper*raise;
			total=total+(upper/counter);
		}
		System.out.println("e raised to the power of "+raise+" according to Java: "+Math.exp(raise));
		System.out.println("Same, using MacLaurin approximation with "+numex+" steps: "+total);
	}
}