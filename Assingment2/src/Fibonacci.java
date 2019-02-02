//Accept the one number and print that number of element from fibonacci series
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("Enter any integer");
        int a = s.nextInt();
        fibonacci(a);

	}
	
	public static void fibonacci(int x)
	{
		if(x<0)
		{
			System.out.println("Enter the positive number");
		}
		else
		{
			int a = 0;
			int b = 0;
			int c = 1;
			for(int i = 1; i<=x;i++)
			{
			    a = b;
			    b = c;
			    c = a+b;
			    System.out.print(c+" ");
			}    
		}
	}

}
