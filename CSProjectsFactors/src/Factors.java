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
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(12);
		nums.add(24);
		nums.add(6);
		nums.add(4);
		
		System.out.println(getSmallest(nums));

		getGDC(nums);
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
	
	public static void getGDC(ArrayList<Integer> gdc) {
		System.out.println("Finding the Greatest Common Denominator...");
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