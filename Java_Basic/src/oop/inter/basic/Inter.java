package oop.inter.basic;

// 인터페이스: 객체의 규격(기능)을 표준화해서 명세하는 역할.
public interface Inter extends ParentInter {
	
	// 인터페이스에서 변수를 선언하면 상수(static final)로 지정합니다.
	int num = 5;

//	Inter(){
//		인터페이스에서는 생성자를 가질 수 없습니다. (객체화 될 수 없는 개념입니다.)	
//	}
	
	// 인터페이스에서는 메서드를 선언하면 추상 메서드로 지정됩니다. (바디{}를 지워야함)
	void method1();
	
	public static void staticMethod() { // 출력은 가능함
		System.out.println("가능합니다~");
		// 호출도 가능한데 static 타입의 객체 호출만 가능.
	}
}
