package _6.Patterns_Programs;

import java.util.Scanner;

public class HollowFull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int i, j, k = 0;
		for (i = 1; i <= n; i++) {
			for (j = i; j < n; j++) {
				System.out.print(" ");
			}
			while (k != (2 * i - 1)) {
				if (k == 0 || k == 2 * i - 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				k++;
			}
			k = 0;
			System.out.print("\n"); // print next row
		}
		for (i = 0; i < 2 * n - 1; i++) {
			System.out.print("*");
		}

	}

}
