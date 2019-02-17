//Accept the three numbers from user and return its average
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
		System.out.println("Enter the third number");
		int c = s.nextInt();
		avg(a,b,c);
	}
	
	public static void avg(int x,int y,int z)
	{
		float ans = 0.0f;
		ans = x+y+z/3;
		System.out.println("Average of the given three numbers is = "+ans);
	}

}
