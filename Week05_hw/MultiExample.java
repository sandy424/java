package Week05_hw;

public class MultiExample {

	public static void main(String[] args) {
		
		Multi myMul = new Multi();
		
		int x = 5;
		int y = 6;
		
		int result1 = myMul.mul(x,y);
		System.out.println(x + " x " + y + " = " + result1);
		
		System.out.println("-----매개값 제공------");
		int result2 = myMul.mul(2, 9);
		System.out.println("result2 = " + result2);
	}

}
