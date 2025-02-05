package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Number: ");
		int n = in.nextInt();
		boolean[] numbers = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			numbers[i] = true;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
		    if (numbers[i] == true) {
		    	for (int j = i * i; j <= n; j = j + i) {
		    		numbers[j] = false;
		    	}
		    }
		}
		for (int i = 0; i < numbers.length; i++) {
		    if (numbers[i] == true) {
		    	System.out.println(i);
		    }
		}
	}
}