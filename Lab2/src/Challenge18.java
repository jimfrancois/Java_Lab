import java.util.Scanner;
public class Challenge18 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please, enter a number: ");
	int num = input.nextInt();
	
	
	//The condition
	if(num < 10) {
		
		System.out.println("Too low!");
		
	}
	else {
		if(num >= 10 && num <= 20) {
			System.out.println("Correct!");
			
		}
		else {
			
			System.out.println("Too high!");
				
		}

	}
		

	}

	}