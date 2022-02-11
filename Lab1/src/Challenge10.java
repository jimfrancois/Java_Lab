import java.util.Scanner;
public class Challenge10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of kilos: ");
		double kilo = input.nextDouble();
		
		double pounds = kilo * 2.204; 
		
		System.out.println("The weight is " + pounds + " pounds");
		
	}

}