package Skill2;
import java.util.*;
public class SumAndAvg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		sc.close();
		float avg=sum/n;
		System.out.println("Sum of the array is: "+sum);
		System.out.println("Avg of the array is: "+avg);
	}
}
