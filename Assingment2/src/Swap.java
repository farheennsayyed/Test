//Accept the two characters from user and swap the contents of that two characters
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Scanner s = new Scanner(System.in);
         System.out.println("Enter the first character");
         char a = s.next().charAt(0);
         System.out.println("Enter the second character");
         char b = s.next().charAt(0);
         
         swap(a,b);
	}
	
	public static void swap(char ptr1,char ptr2)
	{
		char temp;
		temp = ptr1;
		ptr1 = ptr2;
		ptr2 = temp;
	    System.out.println("Numbers after swapping = "+ptr1+"  "+ptr2);
		
	}

}
