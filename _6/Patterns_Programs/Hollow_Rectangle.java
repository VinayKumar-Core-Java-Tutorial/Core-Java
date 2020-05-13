package _6.Patterns_Programs;

import java.util.Scanner;

public class Hollow_Rectangle {
	static void hollow_rectangle(int n, int m) {
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= m; j++) {
				if (i == 1 || i == n || j == 1 || j == m)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows, columns;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number of rows : ");
		rows = sc.nextInt();
		System.out.print("\nEnter the number of columns : ");
		columns = sc.nextInt();
		System.out.print("\n");
		hollow_rectangle(rows, columns);

	}

}