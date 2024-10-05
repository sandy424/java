package Week05;

public class CalExample {

	public static void main(String[] args) {
		Cal myCal = new Cal();
		
		double result1 = myCal.Rec(10);
		double result2 = myCal.Rec(10,20);
		
		System.out.println("정사각형 넓이= " + result1);
		System.out.println("직사각형 넓이= " + result2);
	}

}
