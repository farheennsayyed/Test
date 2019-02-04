// Accept the one number from user and check whether it is divisible by 5 or not

import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = s.nextInt();
		check(a);

	}
	
	public static void check(int ino)
	{
		if(ino%5==0)
		{
			System.out.println("The given number is divisible by 5");
		}
		else
		{
			System.out.println("The given number is not divisible by 5");
		}
	}

}
