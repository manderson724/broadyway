import java.util.Scanner;
import java.lang.*;

// Fibonacci sequence using recursion.

public class fiboRec {
	static int fibo(int a) {
		if (a <= 1)
			return a;
		return fibo(a - 1) + fibo(a - 2);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer.");
		int userNum = input.nextInt();
		System.out.println();
		
		
		System.out.println("The recursive Fibonacci sequence is: " + fibo(userNum));
		
		System.out.print("\nThe runtime is ");
		System.out.print(System.nanoTime());
		System.out.println(" nanoseconds.");


	}

}
