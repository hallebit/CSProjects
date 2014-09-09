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
			if(num <= 0 || num > 100) {
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
		String fac = "";
		for(int i = num; i > 0; i--) {
			if(num % i == 0) {
				System.out.print(i + " ");
				fac += i + "";
			}
		}
		System.out.println();
	}
	
	public static void getGDC(int num1, int num2) {
		System.out.println("Finding the Greatest Common Denominator for " + num1 + " and " + num2);
		String gdc = "";
		if(num1 < num2) {
			for(int i = num1; i >= 1; i--) {
				if(num2 % i == 0 && num1 % i == 0) {
					gdc = i + "";
				}
			}
		}else if(num1 > num2) {
			for(int i = num2; i >= 1; i--) {
				if(num2 % i == 0 && num1 % i == 0) {
					gdc = i + "";
				}
			}		
		}else {
			gdc = num1 + "";
		}
	}

}