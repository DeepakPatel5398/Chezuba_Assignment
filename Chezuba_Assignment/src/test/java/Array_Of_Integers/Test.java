package Array_Of_Integers;
import java.util.Scanner;

public class Test {
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of digits: ");
	        int n = scanner.nextInt();     // n=size of an array
            int[] digits = new int[n];
                                          // take elements 1 by 1 from user
	       System.out.println("Enter the digits one by one:");
	        for (int i = 0; i < n; i++) {
	            digits[i] = scanner.nextInt();
	        }

	        // Increment the  greater integer by one
	        int[] result = incrementByOne(digits);

	        // Print the resulting array
	        System.out.print("Resulting digits: [");
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i]);
	            if (i < result.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }

	    public static int[] incrementByOne(int[] digits) {
	        int n = digits.length;
	        // Traverse the array from the last digit
	        for (int i = n - 1; i >= 0; i--) {
	            if (digits[i] < 9) {
	                // If the current digit is less than 9, just increment it and return the array
	                digits[i]++;
	                return digits;
	            }
	            // Set the current digit to 0 and continue to the next significant digit
	            digits[i] = 0;
	        }

	        // If we are here, all digits were 9, so we need to handle the carry
	        int[] newNumber = new int[n + 1];
	        newNumber[0] = 1;
	        return newNumber;
	    }
}