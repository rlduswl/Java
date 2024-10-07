package inheritance;

public class ColorPointTest {
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
