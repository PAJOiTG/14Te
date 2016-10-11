import java.util.Scanner;

public class calctest {

	public static void main(String[] args) {
		/** Start msg **/
		System.out.println("Do the maths!");
		
		/** Variables **/
		double inputvalue1, inputvalue2;
		String mathsymbol;
		
		/** Procedure **/		
		Scanner input = new Scanner(System.in);
		inputvalue1 = input.nextInt();
		mathsymbol =  input.next();
		inputvalue2 = input.nextInt();
		
		switch (mathsymbol) {
		case "+": 
		System.out.print(inputvalue1 + " " + mathsymbol + " " + inputvalue2 + " =");
		System.out.println(inputvalue1 + inputvalue2);
		break;
		case "-": 
			System.out.print(inputvalue1 + " " + mathsymbol + " " + inputvalue2 + " = ");
			System.out.println(inputvalue1 - inputvalue2);
		break;
		default:
			System.out.print("Error");

		}
	}
}
