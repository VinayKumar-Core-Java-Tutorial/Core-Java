package _6.Patterns_Programs;

import java.util.Scanner;

public class Inverted_Full {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i, j, k = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i = n; i >= 1; --i) {
			for (j = 0; j < n - i; ++j) {
				System.out.print(" ");
			}
			for (j = i; j <= 2 * i - 1; ++j) {
				System.out.print("*");
			}
			for (j = 0; j < i - 1; ++j) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
