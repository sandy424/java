package Week05_hw;

import java.util.Scanner;

public class CalculExample {

	public static void main(String[] args) {
		
		Calcul myCal = new Calcul();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x값을 입력하세요: ");
		int x = scan.nextInt();
		System.out.print("y값을 입력하세요: ");
		int y = scan.nextInt();
		
		System.out.println("----- 결과 -----");
		
		int result1 = myCal.plus(x,y);
		System.out.println("덧셈 = " + result1);
		
		int result2 = myCal.minus(x, y);
		System.out.println("뺄셈 = " + result2);
		
		int result3 = myCal.multi(x, y);
		System.out.println("곱셈 = " + result3);
		
		double result4 = myCal.divide(x, y);
		System.out.println("나눗셈 = " + result4);
	}

}
