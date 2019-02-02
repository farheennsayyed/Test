import java.util.Scanner;

//Accept one character from user and convert case of that character 
public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("Enter any character");
        char a = s.next().charAt(0);
        display(a);

	}
	
	public static void display(char cval)
	{
		
		int temp ;
		temp =(int)cval;
        temp = temp - 32;
        cval = (char) temp;
        System.out.print("Equivalent Character in Uppercase = " +cval);
	}

}
