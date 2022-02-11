import java.util.Scanner;
public class Challenge11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number over 100: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter the second number under 10: ");
		int num2 = input.nextInt();
		
		int Answer = num1 / num2; 
		
		System.out.println(num2 + " goes into " + num1 + ", " + Answer + " times." );
		
	}

}