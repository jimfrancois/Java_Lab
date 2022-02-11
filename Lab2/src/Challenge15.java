import java.util.Scanner;
public class Challenge15 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please, type your favourite color: ");
	String color = input.nextLine();
	
	
	//The condition
	if(color.equals("red") || color.equals("RED")|| color.equals("Red")) {
		System.out.println("I like red too!");
	}
	else {
		System.out.println("I don't like that color, I prefer Red.");

	}

	}

}
