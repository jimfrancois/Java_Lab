import java.util.Scanner;
public class Challenge13 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first number: ");
	int number1 = input.nextInt();
	
	System.out.println("Enter the second number: ");
	int number2 = input.nextInt();
	
	//The condition
	if(number1 > number2) {
		System.out.println(number2 + " "+ number1);
	}
	else {
		System.out.println(number1 + " "+ number2);

	}

	}

}
