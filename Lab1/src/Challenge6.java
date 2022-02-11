import java.util.Scanner;
public class Challenge6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of slices of pizza you started with: ");
		int sliceStart = input.nextInt();
		
		System.out.print("How many slices have you eaten: ");
		int sliceEnd = input.nextInt();
		
		int  sliceLeft = sliceStart - sliceEnd; 
		
		System.out.println("You have " + sliceLeft+ " slices remainig."  );
		
	}

}