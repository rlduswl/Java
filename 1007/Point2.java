package inheritance;

// 3개의 class 파일을 하나로 합친 것

public class Point2 {
	
	int x , y;
	 void set (int x , int y) {
		 this.x = x;
		 this.y = y;
	 }
	 
	 void showPoint() {
		 System.out.println("( " + x + ", " + y + ") ");
	 }
	 
}

class ColorPoint extends Point{
	String color;
	
	void setColor(String color) {
		this.color = color;
	}

	void showColorPoint () {
		System.out.print(color);
		showPoint();
	}
}

class ColorPointTest {
	public static void main(String[] args) {
		
		Point p = new Point();
		p.set(3, 4);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(6,1);
		cp.setColor("red");
		cp.showColorPoint();	
	}

}