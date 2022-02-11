import java.util.Scanner;
public class Challenge19 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please, enter 1, 2 or 3: ");
	String num = input.nextLine();
	
	
	//The condition
	if(num.equals("1")) {
		
		System.out.println("You entry is the number one!");
		
	}
	else {
		if(num.equals("2")) {
			System.out.println("Good job, you select the second number!");
			
		}
		else {
			if(num.equals("3")) {
				System.out.println("Well done, you select the third number!");
				
			}
		else {
			
			System.out.println("Sorry, the number you've entered is not valid!");
				
		}

	}
		

	}
	}
	}