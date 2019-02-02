//Write a program which accept the number from user and print even factors of that number
import java.util.Scanner;
public class Factor {

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
					if(i%2==0) 
					{
					System.out.println(i);
					}
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
