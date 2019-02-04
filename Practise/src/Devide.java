// Write a program to divide two numbers

import java.util.Scanner;
public class Devide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b= s.nextInt();
		divideNum(a,b);

	}
	
	public static void divideNum(int no1,int no2)
	{
		int ians = 0;
		if(no2==0)
		{
			System.out.println("number can not be divided by zero");
		}
		else
		{
			ians = no1/no2;
			System.out.println("Answer is = "+ians);
		}
			
		
	}

}
