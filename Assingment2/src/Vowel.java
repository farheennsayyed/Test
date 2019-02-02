//Accept one character from user check whether that character is vowel or not
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any character");
		char a = s.next().charAt(0);
		chkVowel(a);

	}
	
	public static void chkVowel(char ans)
	{
		if(ans == 'a'|| ans =='A'||ans =='e'||ans =='E'||ans =='i'||ans =='I'||ans =='o'||ans =='O'||ans =='u'||ans =='U')
		{
			System.out.println("It is a Vowel");
		}
		else
		{
			System.out.println("It is not a Vowel");
		}
	}

}
