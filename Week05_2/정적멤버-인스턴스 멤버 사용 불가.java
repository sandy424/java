package Week05_2;

public class Instance {
	//인스턴스 필드와 메소드 선언
	int field1;
	void method1() {}
	//정적필드와 메소드 선언
	static int field2;
	static void method2() {
		Instance obj = new Instance();
		obj.field1=10;
		obj.method1();
		obj.field2=10;
		obj.method2();
	}
	}
