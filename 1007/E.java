package Q;

import P.*; // P.* 패키지 전부 사용

public class E extends A{
	
//	void set() {
//		
//		C c = new C();
//	    A a = new A(); // public을 사용해서 import를 해주면 사용가능하다
//	    
//	    // 다른 패키지에 있어서 오류 
//	    a.pri = 1;
//	    a.def = 2;
//	    a.pro = 3;
//	    a.pub = 4;
//	    
//		c.anopri = 1;
//		c.anodef = 2;
//		c.anopro = 3;
//		c.anopub = 4;
//}
		
// -------------------------------------------------
	
	int a;
	void set () {
		pro = 3;
		pub = 4;
		
	}
	public static void main(String[] args) {
		E e = new E();
		e.a = 1;
		e.set();
		
		System.out.println(e.a);
		System.out.println(e.pro);
		System.out.println(e.pub);
	}
	
	
}
