//Accept the radius from user and return circumference of the circle
import java.util.Scanner;
public class Radius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius");
		float a = s.nextFloat();
		circum(a);
		}
	public static void circum(float x)
	{
		float PI = 3.14f;
		float ci;
		ci = 2 * PI * x;
		System.out.println("Circumference of the circle is = "+ci);
		
	}

}
