//Accept one number from the user and print that number of * on the screen
import java.util.Scanner;
public class Star {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = s.nextInt();
		accept(a);

	}
   public static void accept(int ino)
   {
	   int iCno = 0;
	   while(iCno<ino)
	   {
		   System.out.println("*");
		   iCno++;
	   }
   }
}
