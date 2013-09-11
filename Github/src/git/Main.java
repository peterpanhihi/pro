package git;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello!");
		System.out.println("Enter A :");
		int a = scan.nextInt();
		System.out.println("Enter B : ");
		int b = scan.nextInt();
		System.out.println("A + B = "+(a+b));
	}
}
