package Skill2;
import java.util.Scanner;
public class Transpose {
	public static void main(String[] args) {
	   try (Scanner sc = new Scanner(System.in)) {
		   int r = sc.nextInt();
		   int c = sc.nextInt();
		   int a[][] = new int[r][c];
		   int b[][] = new int[c][r];
		   for (int i = 0; i < r; i++) {
			   for (int j = 0; j < c; j++) {
				   a[i][j] = sc.nextInt();
			   }
		   }
		   for (int i = 0; i < r; i++) {
			   for (int j = 0; j < c; j++) {
				   b[j][i] = a[i][j];
			   }
		   }
		   System.out.println("Transpose:");
		   for (int i = 0; i < c; i++) {
			   for (int j = 0; j < r; j++) {
				   System.out.print(b[i][j] + " ");
			   }
			   System.out.println();
		   }
	   }
}
}