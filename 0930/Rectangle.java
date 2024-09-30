package oop;

import java.util.Scanner;

public class Rectangle {
	int height;
	int widht;
	public int getArea() {
		return widht * height;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Rectangle rect = new Rectangle();
		
		System.out.print(">> ");
		rect.height = sc.nextInt();
		rect.widht = sc.nextInt();
		
		System.err.println("사각형의 면적은 >> " + rect.getArea());
		sc.close();
		
	}

}
