//Write a program which accept principle amount time and create of interest from user calculate simple interest
import java.util.Scanner;
public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter principle amount");
		float a = s.nextFloat();
		System.out.println("Enter time");
		float b = s.nextFloat();
		System.out.println("Enter rate");
		float c = s.nextFloat();
		simpleInt(a,b,c);

	}
	public static void simpleInt(float principle,float time,float rate)
	{
		float simpleInterest = principle * time * rate;
		System.out.println("simple interest is = "+simpleInterest);
	}

}
