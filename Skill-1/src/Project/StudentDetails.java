package Project;
import java.util.Scanner;
public class StudentDetails {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your Branch: ");
		String Branch = sc.nextLine();
		System.out.println("Enter your CGPA: ");
		float GPA = sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter Your college: ");
		String college = sc.nextLine();
		System.out.println("X===Student's Profile===X");
		System.out.println("Name: "+ name);
		System.out.println("age: "+ age);
		System.out.println("Branch: "+ Branch);
		System.out.println("CGPA: "+ GPA);
		System.out.println("College: "+ college);
		}
	}