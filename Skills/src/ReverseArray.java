package Skill2;
import java.util.*;
public class ReverseArray {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array in Reverse is: ");
        for(int i=n-1;i>=0;i--) {
        	System.out.print(a[i] + " ");
        }
        sc.close();
}
}