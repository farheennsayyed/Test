import java.util.Scanner;

//Accept the one number from user and print that number of * on the screen
public class Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("Enter any integer");
        int a = s.nextInt();
        accept(a);

	}
	
	public static void accept(int x)
	{
		while(x>0)
		{
			System.out.print(" * ");
			x--;
		}
	}

}
