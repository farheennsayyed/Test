//Accept one number from user if number is less than 10 then print Hello otherwise print Demo
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = s.nextInt();
		display(a);

	}
	public static void display(int ino)
	{
		if(ino<10)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Demo");
		}
	}

}
