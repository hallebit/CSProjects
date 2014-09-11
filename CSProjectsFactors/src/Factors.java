import java.util.ArrayList;
import java.util.Scanner;


public class Factors {

	public static Scanner console = new Scanner(System.in);
	
	/**
	 * main!
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String action = getFacsOrGdcOrQuit();
		System.out.println(action);
		
		
		
		/*boolean quit = false;
		boolean error = false;
		int hasNextInt = 0;
		ArrayList<Integer> gdc = new ArrayList<Integer>();
		int num = 0;
		while(!quit) {
			System.out.println("Pick a number between 1 and 100:");
			while(console.hasNextInt()) {
				hasNextInt++;
				gdc.add(console.nextInt());
			}
			if(hasNextInt == 0) {
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
			}else
			error = false;
			gdc.clear();
			hasNextInt = 0;
			num = 0;
		} 
		System.out.print("Thanks for Playing"); */
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
	
	public static void getGDC(ArrayList<Integer> gdc) {
		System.out.println("Finding the Greatest Common Denominator of " + gdc.toString());
		int GDC = 1;
		for(int i = 1; i <= getSmallest(gdc); i++) {
			boolean isGDC = true;
			for(int num = 0; num < gdc.size(); num++) {
				if(gdc.get(num) % i != 0) {
					isGDC = false;
				}
			}
			if(isGDC) {
				GDC = i;
			}
		}
		System.out.print("Greatest Common Denominator is " + GDC);		
	}
	
	//TODO: functionality
	public static String getFacsOrGdcOrQuit() {
		System.out.println("Input one number between 1 and 100 to get all of its factors.");
		System.out.println("Input multiple numbers to get the Greatest Common Denominator.");
		System.out.println("Input 'quit' to quit the program.");
		String input = "";
		int i = 0;
		if(console.hasNextInt()) {
			while(console.hasNextInt()) {
				i++;
				input += i + " " + console.nextInt();
			}
			return input;
		} else if(console.hasNext()) {
			return "q" + console.next();
		} else
			return "Error input invalid";
		
	}
	
	//TODO: functionality
	public static String getInput() {

		return console.next();
	}
	
	public static int getSmallest(ArrayList<Integer> list) {
		int smallest = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i) < smallest) {
				smallest = list.get(i);
			}
		}
		return smallest;
	}
}