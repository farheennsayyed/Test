//Accept one number from the user and print that number of * on the screen
import java.util.Scanner;
public class Starr {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = s.nextInt();
		accept(a);

	}
   public static void accept(int ino)
   {
	   
	   while(ino>0)
	   {
		   System.out.println("*");
		   ino--;
	   }
   }
}

