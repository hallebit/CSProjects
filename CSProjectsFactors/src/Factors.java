import java.util.Scanner;


public class Factors {

	public static Scanner console = new Scanner(System.in);
	
	/**
	 * main!
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		boolean quit = false;
		boolean error = false;
		int num = 0;
		while(!quit) {
			System.out.println("Pick a number between 1 and 100:");
			String input = console.next();
			try {
				num = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				if(input.equalsIgnoreCase("quit")) {
					quit = true;
				} else {
					System.out.println(e);
					error = true;
				}
			}
			if(num <= 0 || num >= 100) {
				if(quit || error) {} else {
					System.out.println("Input not within a valid range");
				}
			} else {
				getFactors(num);
			}
			error = false;
			num = 0;
		} 
		System.out.print("Thanks for Playing");
	}
	
	/**
	 * @param num
	 */
	public static void getFactors(int num) {
		System.out.println("Finding factors of the number " + num + "...");
		for(int i = num; i > 0; i--) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

}