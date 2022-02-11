import java.util.Scanner;
public class Challenge7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name: ");
		String name = input.nextLine();
		
		System.out.println("How old are you: ");
		int age = input.nextInt();
		
		int nextAge = age + 1; 
		
		System.out.println("Hello " +name + " you're " + nextAge );
		
	}

}