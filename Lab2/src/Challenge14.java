import java.util.Scanner;
public class Challenge14 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please, enter a value between 12 and 20: ");
	int number = input.nextInt();
	

	//The condition
	if(number >= 10 && number <= 20 ) {
		System.out.println("Thank you!");
	}
	else {
		System.out.println("Incorrect answer!");

	}

	}

}
