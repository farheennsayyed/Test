//Write a program which accept two numbers from user and display its largest common factor
import java.util.Scanner;
public class Large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num1, Num2, i, GCD = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		Num1 = s.nextInt();
		System.out.println("Enter second number");
		Num2 = s.nextInt();
		for(i = 1; i <= Num1 && i <= Num2; i++)
	    {
	        if(Num1 % i == 0 && Num2 % i == 0)
	        {
	            GCD = i;
	        }
	    }	
		System.out.println("Largest common factor is = " + GCD);

	}
	
	
	
	

}
