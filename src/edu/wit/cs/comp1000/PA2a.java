package edu.wit.cs.comp1000;

import java.util.Scanner;
/**
 * Solution to PA2 part a. When it runs it prints the sum of the positive numbers, sum on non positive numbers, total sum, average of positive numbers
 * average of non positive numbers, and total average to the terminal. 
 * 
 * @author Calvin Shortall
 */
public class PA2a {

	/**
	 * Starts the program, computes and outputs results. 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
	
	int a, b, c, d, e;
	System.out.printf("Enter five whole numbers: ");
	a = input.nextInt();
	b = input.nextInt();
	c = input.nextInt();
	d = input.nextInt();
	e = input.nextInt();
		
	int sum_pos	= 0;
	int num_pos = 0;
	double avg_pos;
	
	if (a > 0 ) {
		sum_pos = sum_pos + a;
		num_pos++;
	}
	if (b > 0 ) {
		sum_pos = sum_pos + b;
		num_pos++;
	}	
	if (c > 0 ) {
		sum_pos = sum_pos + c;
		num_pos++;
	}
	if (d > 0 ) {
		sum_pos = sum_pos + d;
		num_pos++;
	}	
	if (e > 0 ) {
		sum_pos = sum_pos + e;
		num_pos++;
	}
	if (num_pos == 0) {
		 avg_pos = 0.0;
	}
	else {
		 avg_pos = 1.0 * sum_pos / num_pos;
	}
	
	
	int sum_neg	= 0;
	int num_neg = 0;
	double avg_neg;
	if (a <= 0 ) {
		sum_neg = sum_neg + a;
		num_neg++;
	}
	if (b <= 0 ) {
		sum_neg = sum_neg + b;
		num_neg++;
	}	
	if (c <= 0 ) {
		sum_neg = sum_neg + c;
		num_neg++;
	}
	if (d <= 0 ) {
		sum_neg = sum_neg + d;
		num_neg++;
	}	
	if (e <= 0 ) {
		sum_neg = sum_neg + e;
		num_neg++;
	}
	if (num_neg == 0) {
		avg_neg = 0.0;
	}
	else {
		avg_neg = 1.0 * sum_neg / num_neg;
	}
	
	if (num_pos == 1) {
		System.out.printf("The sum of the %d positive number: %d%n", num_pos, sum_pos);
		}
		else {
			System.out.printf("The sum of the %d positive numbers: %d%n", num_pos, sum_pos);	
		}
	if (num_neg == 1) {
	System.out.printf("The sum of the %d non-positive number: %d%n", num_neg, sum_neg);
	}
	else {
		System.out.printf("The sum of the %d non-positive numbers: %d%n", num_neg, sum_neg);	
	}	
	
	int total_sum = a + b + c + d + e;
	System.out.printf("The sum of the 5 numbers: %d%n", total_sum);
	
	
		if (num_pos == 1) {
			System.out.printf("The average of the %d positive number: %.2f%n", num_pos, avg_pos);
		}
		else {
			System.out.printf("The average of the %d positive numbers: %.2f%n", num_pos, avg_pos);
		}
		
	if (num_neg == 1) {
		System.out.printf("The average of the %d non-positive number: %.2f%n", num_neg, avg_neg);
	}
	else {
		System.out.printf("The average of the %d non-positive numbers: %.2f%n",num_neg, avg_neg);
	}
	
	double total_average = total_sum / 5.0;
	System.out.printf("The average of the 5 numbers: %.2f%n", total_average);

	}


}
