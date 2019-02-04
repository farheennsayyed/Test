//Accept one number and return number by subtracting 5 from it
import java.util.Scanner;
public class Substract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = s.nextInt();
	    sub(a);
		

	}
	
	public static void sub(int ino)
	{
		int ians = 0;
		ians = ino-5;
		System.out.println(ians);
		
	}

}
