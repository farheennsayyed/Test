// Accept number in decimal format and print its binary equivalent number.
import java.util.Scanner;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any decimal number");
		int a = s.nextInt();
		accept(a);
		

	}
	public static void accept(int x)
	{
		int binary[]=new int[1000];
		int i = 0;
		while(x>0)
		{
			binary[i++] = x%2;
			x = x/2;
		}
		for(int j = i-1; i>=0;i--)
		{
			System.out.print(binary[i]);
		}
		System.out.println();
	}

}
