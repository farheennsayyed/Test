//Accept range from user and print all numbers between that range.
import java.util.Scanner;
public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = s.nextInt();
		System.out.println("Enter second number");
		int b = s.nextInt();
		range(a,b);
	}
	public static void range(int x,int y)
	{
		while(x>0 && y>x)
		{
			
			System.out.print("Range is = "+x+" "+y);
			x= x+1;
			y = y+1;
			x++;
			y++;
		}
	}

}
