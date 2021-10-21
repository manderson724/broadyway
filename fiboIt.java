import java.util.Scanner;
import java.lang.*;

// Fibonacci sequence using iteration.

public class fiboIt {
	static void fibo(int b) {
		int val_1 = 0, val_2 = 1;
		int count = 0;
		
		while (count < b) {
			
		
		System.out.print(val_1 + " ");
		
		int val_3 = val_1 + val_2;
		
		val_1 = val_2;
		val_2 = val_3;
		count = count + 1;
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer.");
		
		int b = input.nextInt();
		System.out.println("The iterative Fibonacci sequence is: ");
		fibo(b);
		System.out.println();
		
		System.out.print("\nThe runtime is ");
		System.out.print(System.nanoTime());
		System.out.println(" nanoseconds.");

	}

}
