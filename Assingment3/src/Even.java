//Accept range from user and print all even numbers between that range.
//10 20
// 10 12 14 16 18 20 
import java.util.Scanner;
 public class Even
 {
	 public static void main(String[] args)
	 {
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter the first number");
		  int a = s.nextInt();
		  System.out.println("Enter the second number");
		  int b = s.nextInt();
		  sumEven(a,b);
	 }
	 
	 public static void sumEven(int x, int y)
	 {
		while(x<=y)
		{
			if(x%2 == 0)
			{
			System.out.println(" "+x+" ");
			
			}
		x++;
        }			
	 }
	 
 }
 