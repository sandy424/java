package Week05_hw;

public class FigureExample {

	public static void main(String[] args) {
		
		Figure myFig = new Figure();
		
		double result1 = myFig.Fig(5);
		double result2 = myFig.Fig(5,10);
		
		System.out.println("정삼각형의 넓이: " + result1);
		System.out.println("직삼각형의 넓이: " + result2);
		
		

	}

}
