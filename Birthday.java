/*
Course: Intro To Computer Science
Homework: 2
Task: 3
Name: Guy Itzhaki
E-mail: itzhaki1234@gmail.com
*/
// Prints the number of persons which has to be for the odd of more than 50%
public class Birthday
{
	public static double probSameBirthday(int n)
	{
		double percno=1.0;
		for (int i=1; i<n; i++)
			percno=percno*(1.0-(i/365.0));
		return (1-percno);
	}

	public static void main (String[] args)
	{
		int i=1;
		double prob=probSameBirthday(i);
		while (prob<0.5)
		{
			i++;
			prob=probSameBirthday(i);	
		}
		System.out.println("The number of persons which the probability is 50% that at least two of the have the same birthday is: "+i);
	}
}
