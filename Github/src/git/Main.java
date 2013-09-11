package src.git;

import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		JFrame frame = new JFrame("This is my User Interface");
		frame.setSize(400, 400);
		frame.setVisible(true);
		System.out.println("Hello!");
		System.out.println("Enter A :");
		int a = scan.nextInt();
		System.out.println("Enter B : ");
		int b = scan.nextInt();
		System.out.println("A + B = "+(a+b));
	}
}
