package oop;

public class Cirle {
	
	public int radius; // 원의 반지름 필드
	public String name; // 원의 이름 필드
	
	public Cirle() { // 원의 생성자 메소드
		
	}
	public double getArea() { // 원의 면적 계산 메소드
		return 3.141592*radius*radius; 
	}
	public static void main(String[] args) {
		
		Cirle pizza = new Cirle();
		pizza.radius = 10;
		pizza.name="자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적 >> " + area);
		
		Cirle donut = new Cirle();
		donut.name="자바도넛";
		donut.radius=5;
		area = donut.getArea();
		System.out.println(donut.name + "의 면적 >> " + area);
		
	}
}
