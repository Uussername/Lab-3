import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choose a program number6\n1) Passwords\n2) Word counter\n3) Phone numbers\n4) ID number generator\n5) Quit");
		Scanner keyboard = new Scanner(System.in);
		int input = keyboard.nextInt();
		boolean Loop = true;
		while(Loop == true)
		{
			if (input == 1) {
				Pass();
			}
			if (input == 2) {
				 Phrase();
			}
			if (input == 3) {
				Phone();
			}
			if (input == 4){
				IdNum();
			}
			if (input == 5) {
				Loop = false;
			}
			else {
				System.out.println("please neter a valid program number");
				input = keyboard.nextInt();
			}
		}
	}
	public static void Pass() 
	{
		System.out.println("Password\nenter a password with a number, uppercase and lowercase letters\n");
		String password = JOptionPane.showInputDialog("Enter a password");
		boolean lengthMin = password.length() < 6;
		boolean lengthMax = password.length() > 10;
		boolean upcase = !password.equals(password.toUpperCase());
		boolean lowcase = !password.equals(password.toLowerCase());
		boolean number = !password.matches(".*\\d+.*");
		while(lengthMin == true || lengthMax == true || upcase == false || lowcase == false || number == true) 
		{	
			password = JOptionPane.showInputDialog("Enter a password between 6-10 characters");
			lengthMin = password.length() < 6;
			lengthMax = password.length() > 10;
			upcase = !password.equals(password.toUpperCase());
			lowcase = !password.equals(password.toLowerCase());
		}
		System.out.println(password +" is a valid password!");
	}
	
	
	public static void Phrase() 
	{
		System.out.println("word counter!\nenter a phrase\n");
		String phrase = JOptionPane.showInputDialog("Throw in a sentence");
		
	}
	
	
	public static void Phone() 
	{
		boolean check = false;
		System.out.println("Phone numbers!\nenter 10 digits\n");
		String phone = JOptionPane.showInputDialog("Enter in ten digits");
		while (check == false) 
		{
		if (phone.matches("[0-9]+") && phone.length() == 10) 
			{
			check = true;
			System.out.println("The phone number is:");
			String phoneNum = "(" + phone.substring(0, 3) + ")" + phone.substring(3,6) + "-" + phone.substring(6,10);
			System.out.println(phoneNum);
			}
		else 
			{
			phone = JOptionPane.showInputDialog("Enter in TEN DIGITS");
			}
		}
	}
	public static void IdNum() 
	{
		System.out.println("ID num maker\nenter a your full name and address.\n");
		String name = JOptionPane.showInputDialog("Enter your name");
		String address = JOptionPane.showInputDialog("Enter your address");	
	}
}

		
