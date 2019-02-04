//Accept the one character from user and display that character on screen
import java.util.Scanner;
public class Dispaly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = s.next().charAt(0);
		display(ch);

	}
	public static void display(char cVal)
	{
		System.out.println(cVal);
	}

}
