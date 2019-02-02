//Write a program which accept one number from user and print that number is even number or not
import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = s.nextInt();
		printEven(a);

	}
	
	public static void printEven(int ino)
	{
		if(ino%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}

}
