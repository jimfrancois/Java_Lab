import java.util.Scanner;
public class Challenge12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value less than 20: ");
		int number = input.nextInt();
		
		if (number >= 20) {
			System.out.println("Too high ");
		}
		
		else {
			System.out.println("Thank you!"  );
			
		}
		
	}

}
