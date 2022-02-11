import java.util.Scanner;
public class Challenge17 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("How old are you?: ");
	int age = input.nextInt();
	
	
	//The condition
	if(age == 18) {
		
		System.out.println("You can vote");
		
	}
	else {
		if(age == 17) {
			System.out.println("You can learn to drive.");
			
		}
		else {
			if(age == 16) {
				System.out.println("You can buy a lottery ticket.");
				
			}
			else {
				System.out.println("You're an adult.");
			}
			
		}

	}
		

	}

	}


