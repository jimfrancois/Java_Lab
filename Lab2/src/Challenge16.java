import java.util.Scanner;
public class Challenge16 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Is it raining?: ");
	String temperature = input.nextLine();
	temperature = temperature.toLowerCase();
	
	
	//The condition
	if(temperature.equals("yes")) {
		
		System.out.println("Is it windy?: ");
		String windy = input.nextLine(); 
		windy = windy.toLowerCase();
		
		if(windy.equals("yes")) {
			System.out.println("It is too windy for an umbrella.");
			
		}
		else {
			System.out.println("Take an umbrella.");

		}

	}
	else {
		System.out.println("Enjoy your day!");

	}

	}

}
