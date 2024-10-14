package edu.wit.cs.comp1000;
import java.util.Scanner;
/**
 * Solution to PA2 part b. When the program runs it prints the root(s) of given numbers to the terminal.
 * 
 * @ Calvin Shortall
 */
public class PA2b {

	/**
	 * Starts the program, computes and outputs results to terminal.
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	System.out.printf("Enter a b c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = b*b-4*a*c;
		double root = -b/(2*a);
		double first = (-b + Math.sqrt(discriminant))/(2*a);
		double second = (-b - Math.sqrt(discriminant))/(2*a);
	
		if (discriminant < 0) {
			System.out.printf("Roots: imaginary%n");
		} 
		else if (discriminant == 0) {
			System.out.printf("Root: %.2f%n", root);
		} 
		else {
			if (first < second) {
				System.out.printf("Roots: %.2f, %.2f%n", first, second);	
			}
			else {
				System.out.printf("Roots: %.2f, %.2f%n", second, first);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
