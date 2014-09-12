import java.util.ArrayList;
import java.util.Scanner;


public class Factors {

	public static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		getNumsOrQuit();
	}
	
	public static void getNumsOrQuit() {
		System.out.println("Input one number between 1 and 100 to get all of its factors.");
		System.out.println("Input multiple numbers to get the Greatest Common Denominator.");
		System.out.println("Input 'quit' to quit the program.");
		while(console.hasNextInt()) {
			ArrayList<Integer> input = numOrNums(console.nextLine());
			if(input.size() == 1) {
				getFactors(input.get(0));
			} else {
				getGDC(input);
			}
		}
		if(console.hasNext()) {
			if(console.next().equalsIgnoreCase("quit")) {
				System.out.println("Thanks for playing");
			} else {
				System.out.println("Error input invalid, try again.");
				System.out.println();
				getNumsOrQuit();
			}
		}	
	}
	
	public static ArrayList<Integer> numOrNums(String toFind) {
		ArrayList<Integer> toReturn = new ArrayList<Integer>();
		String toSearch = toFind;
		if(toSearch.contains(" ")) {
			toSearch = toSearch + " ";
			while(toSearch.contains(" ")) {
				try {
					toReturn.add(Integer.parseInt(toSearch.substring(0, toSearch.indexOf(" "))));
					toSearch = toSearch.substring(toSearch.indexOf(" ") + 1);
				} catch(NumberFormatException e) {
					System.out.println("Error input invalid, try once more.");
					System.out.println();
					getNumsOrQuit();
				}
			}
		} else {
			try {
				toReturn.add(Integer.parseInt(toFind));
			} catch(NumberFormatException e) {
				System.out.println("Error input invalid, please input data again");
				System.out.println();
				getNumsOrQuit();
			}
		}
		return toReturn;
	}
		
	public static void getFactors(int num) {
		if(num <= 100 && num >= 1) {
			System.out.println("Finding factors of the number " + num + "...");
			for(int i = num; i > 0; i--) {
				if(num % i == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		} else {
			System.out.println("Input is not within a valid range, please try again");
			System.out.println();
			getNumsOrQuit();
		}
		
	}
	
	public static void getGDC(ArrayList<Integer> gdc) {
		System.out.println("Finding the Greatest Common Denominator of " + gdc.toString() + "...");
		int GDC = 1;
		boolean withinRange = true;
		for(int i = 1; i <= getSmallest(gdc); i++) {
			boolean isGDC = true;
			for(int num = 0; num < gdc.size(); num++) {
				if(gdc.get(num) <= 100 && gdc.get(num) >= 1) {
					if(gdc.get(num) % i != 0) {
						isGDC = false;
					}
				} else {
					withinRange = false;
				}
			}
			if(isGDC) {
				GDC = i;
			}
		}
		if(withinRange) {
			System.out.println("Greatest Common Denominator is " + GDC);		
		} else {
			System.out.println("Input is not within a valid range, please try again");
			System.out.println();
			getNumsOrQuit();
		}
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