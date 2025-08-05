package Skill2;
import java.util.*;
public class BiggestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int big = a[0];    
        int small = a[0];  
        for (int i = 1; i < n; i++) {
            if (a[i] > big) {
                big = a[i];
            }
            if (a[i] < small) {
                small = a[i];
            }
        }
        System.out.println("Biggest is: " + big);
        System.out.println("Smallest is: " + small);
    }
}
