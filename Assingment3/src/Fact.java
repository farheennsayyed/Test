//Write a program which accept one number from user and display factorial of that number on screen
import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = s.nextInt();
		fact(a);

	}
	
	public static void fact(int x)
	{
		int fact = 1;
		for(int i = 1;i<=x;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of the number = "+fact);
	}

}
