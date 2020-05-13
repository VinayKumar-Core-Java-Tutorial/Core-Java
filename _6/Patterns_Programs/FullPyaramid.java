package _6.Patterns_Programs;

import java.util.Scanner;

public class FullPyaramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i, j, k = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i = 1; i <= n; ++i, k = 0) {
			for (j = 1; j <= n - i; ++j) {
				System.out.print(" ");
			}
			while (k != 2 * i - 1) {
				System.out.print("*");
				++k;
			}
			System.out.print("\n");
		}

	}

}
