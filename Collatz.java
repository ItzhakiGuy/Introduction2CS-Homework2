/*
Course: Intro To Computer Science
Homework: 2
Task: 2
Name: Guy Itzhaki
E-mail: itzhaki1234@gmail.com
*/
// Prints the numbers which are done by the math problem by it's sort
public class Collatz
{
	public static void main (String[] args)
	{
		int num=Integer.parseInt(args[0]);
		String updown=args[1];
		int change=0;
		if (updown.equals("v"))
		{
			for (int i=1; i<=num; i++)
			{
				change=i;
				System.out.print(change+" ");
				while (change!=1)
				{
					if (change%2==0)
						change=change/2;
					else
						change=change*3+1;
					System.out.print(change+" ");		
				}
				System.out.println();
			}
		}
		else
			if (updown.equals("c"))
			{	
				for (int i=num; i>=1; i++)
				{
					change=i;
					System.out.print(change+" ");
					while (change!=1)
					{
						if (change%2==0)
							change=change/2;
						else
							change=change*3-1;
					System.out.print(change+" ");		
					}
					System.out.println();
				}
			}
			else
				System.out.println("There is a fault mode.");
		System.out.println("The First "+num+" hailstone sequences reached 1.");
	}
}