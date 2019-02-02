/*Accept the two integers from user and swap the contents of that two integers 
without using temp variable*/
import java.util.Scanner;
public class Swapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int a = s.nextInt();
        System.out.println("Enter the second integer");
        int b = s.nextInt();
        swap(a,b);

	}
	
	public static void swap(int x,int y)
	{
		System.out.println("Two integers before swapping = "+x+" "+y);
		
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("Two integers after swapping = "+x+" "+y);
	}

}
