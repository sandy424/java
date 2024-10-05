package Week05;

public class Calculator {
	//리턴값이 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//호출한 곳으로 결과값 int를 리턴하는 메소드 선언
	int plus(int x, int y) {
		int result = x + y;
		return result;   //리턴값 지정
	}
	
	double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;   //리턴값 지정
	}
}
