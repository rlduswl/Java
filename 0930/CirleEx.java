package oop;

public class CirleEx {
	
	public int radius; // 원의 반지름 필드
	public String name; // 원의 이름 필드
	
	public CirleEx() { // 원의 생성자 메소드
		
	}
	public double getArea() { // 원의 면적 계산 메소드
		return 3.141592*radius*radius; 
	}
}

