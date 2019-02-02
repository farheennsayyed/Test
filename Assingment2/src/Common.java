//Write a program which accept the two numbers from user and display its common factors
import java.util.Scanner;
public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = s.nextInt();
		displayEvenFact(a);

	}
	public static void displayEvenFact(int ino)
	{
		if(ino<=0)
		{
			System.out.println("Enter the positive number");
		}
		else
		{
			try
			{
			for(int i=1;i<=ino;i++)
			{
				
				if(ino%i==0)
				{ 
					
					System.out.println(i);
					
				}
			}
		    }
			catch(Exception e)
			{
				System.out.println("Caught an exception");
			}
			
		}
	}

}

