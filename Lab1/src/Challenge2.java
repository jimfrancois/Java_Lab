import java.util.Scanner;
public class Challenge2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your firstName: ");
		String firstName = input.nextLine();
		System.out.println("Your firstName is "+ firstName);
		
		System.out.println("What is your lastName: ");
		String lastName = input.nextLine();
		System.out.println("Your lastName is "+ lastName);
		
		System.out.println("Your fullname is " + firstName + " " + lastName);
		
	}

}
